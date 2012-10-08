package robmod.robmod.diagram.edit.parts;
 
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;

import robmod.robmod.Component;
import robmod.robmod.Handler;
import robmod.robmod.InputPort;
import robmod.robmod.OutputPort;

 
import org.eclipse.emf.common.util.EList;
 
public class OrderingHelper {
 
	public static void numberValueChanged(Component thread) {
		Map<InputPort, HandlerDsc> port_handler_mapping = new HashMap<InputPort, HandlerDsc>();
		Map<Handler, HandlerDsc> handlersDsc = new HashMap<Handler, HandlerDsc>();
		Vector<HandlerDsc> order = new Vector<HandlerDsc>();
		
		//System.out.println("generateOrder(" + thread + ")");
		
		// genarates graph structure
		
		EList<Component> components = thread.getComposition();	
		for (Component c : components) {
			EList<Handler> handlers = c.getHandlers();
			for (Handler h : handlers) {
				HandlerDsc hh = new HandlerDsc();
				EList<InputPort> ports = h.getTrigeredBy();
				for(InputPort p : ports) {
					hh.tokens.put(p, false);
					port_handler_mapping.put(p, hh);
				}
				hh.handler = h;
				handlersDsc.put(h, hh);
			}
		}
		
		for (Component c : components) {
			EList<Handler> handlers = c.getHandlers();
			for (Handler h : handlers) {
				HandlerDsc hh = handlersDsc.get(h);
				EList<OutputPort> generated_ports = h.getGenerates();
				for(OutputPort p : generated_ports) {
					EList<InputPort> connected_ports = p.getConnection();
					for(InputPort cp : connected_ports) {
						EList<Handler> triggered_handlers = cp.getTrigger();
						for(Handler th : triggered_handlers) {
							hh.trigger.put(cp, handlersDsc.get(th));
						}
					}
				}
				EList<Component> before_components = c.getBefore();
				for(Component cc : before_components) {
					EList<Handler> before_handlers = cc.getHandlers();
					for(Handler hhh : before_handlers) {
						hh.before.add(handlersDsc.get(hhh));
					}
				}
			}
		}
		//find starting node
		
		HandlerDsc hh = null;
		
		for(HandlerDsc h : handlersDsc.values()) {
			if(h.tokens.isEmpty() && h.before.isEmpty()) {
				hh = h;
			}
		}
		
		//System.out.println("generateOrder.startingNode(" + hh + ")");

		
		while (hh != null) {
			order.add(hh);
			hh = getNextHandler(hh);
		}
		
		//System.out.println("generateOrder.order(" + order + ")");

		for (int i = 0; i < order.size(); i++) {
			Component c = (Component)order.elementAt(i).handler.eContainer();
			c.setExecutionOrder(i);
		}
	}
	
	public static HandlerDsc getNextHandler(HandlerDsc handler) {
		Vector<HandlerDsc> handlers_run = new Vector<HandlerDsc>();
		for(Entry<InputPort, HandlerDsc> e : handler.trigger.entrySet()) {
			e.getValue().tokens.put(e.getKey(), true);
		}
		//System.out.println("generateOrder.triggers(" + handler.trigger + ")");

		for(HandlerDsc h : handler.trigger.values()) {
			if(canRun(h)) {
				if(!handlers_run.contains(h))
					handlers_run.add(h);
			}
		}
		
		for(HandlerDsc h : handler.before) {
			if(canRun(h)) {
				if(!handlers_run.contains(h))
					handlers_run.add(h);
			}
		}
		Vector<HandlerDsc> handlers_run_tmp = (Vector<HandlerDsc>)handlers_run.clone();
		for(HandlerDsc h : handlers_run_tmp) {
			for(HandlerDsc hh : h.before) {
				handlers_run.remove(hh);
			}
		}
		
		//System.out.println("generateOrder.run(" + handlers_run + ")");

		
		if(handlers_run.isEmpty())
			return null;
		if(handlers_run.size() == 1)
			return handlers_run.firstElement();
		
		return null;
	}
	
	public static boolean canRun(HandlerDsc handler) {
		//System.out.println("generateOrder.tokens(" + handler.tokens + ")");
		for(Boolean t : handler.tokens.values()) {
			if(t == false)
				return false;
		}
		return true;
	}
}
