package robmod.robmod.diagram.edit.parts;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.Map.Entry;

import robmod.robmod.Handler;
import robmod.robmod.InputPort;

public class HandlerDsc {
	public HandlerDsc() {
		tokens = new HashMap<InputPort, Boolean>();
		trigger = new HashMap<InputPort, HandlerDsc>();
		before = new Vector<HandlerDsc>();
	}
	public Map<InputPort, Boolean> tokens;
	public Map<InputPort, HandlerDsc> trigger;
	public Vector<HandlerDsc> before;
	public Handler handler;
}