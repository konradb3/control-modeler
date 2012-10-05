package robmod.robmod.diagram.edit.policies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetViewMutabilityCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import robmod.robmod.RobmodPackage;
import robmod.robmod.diagram.edit.parts.Component2EditPart;
import robmod.robmod.diagram.edit.parts.ComponentEditPart;
import robmod.robmod.diagram.edit.parts.HandlerEditPart;
import robmod.robmod.diagram.edit.parts.InputPort2EditPart;
import robmod.robmod.diagram.edit.parts.InputPortEditPart;
import robmod.robmod.diagram.edit.parts.OutputPort2EditPart;
import robmod.robmod.diagram.edit.parts.OutputPortEditPart;
import robmod.robmod.diagram.edit.parts.PropertyEditPart;
import robmod.robmod.diagram.part.RobmodDiagramUpdater;
import robmod.robmod.diagram.part.RobmodLinkDescriptor;
import robmod.robmod.diagram.part.RobmodNodeDescriptor;
import robmod.robmod.diagram.part.RobmodVisualIDRegistry;

/**
 * @generated
 */
public class ComponentCanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	private Set/*[org.eclipse.emf.ecore.EStructuralFeature]*/myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	protected void refreshOnActivate() {
		// Need to activate editpart children before invoking the canonical refresh for EditParts to add event listeners
		List/*[?]*/c = getHost().getChildren();
		for (int i = 0; i < c.size(); i++) {
			((EditPart) c.get(i)).activate();
		}
		super.refreshOnActivate();
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet/*[org.eclipse.emf.ecore.EStructuralFeature]*/();
			myFeaturesToSynchronize.add(RobmodPackage.eINSTANCE
					.getComponent_OutputPorts());
			myFeaturesToSynchronize.add(RobmodPackage.eINSTANCE
					.getComponent_Handlers());
			myFeaturesToSynchronize.add(RobmodPackage.eINSTANCE
					.getComponent_Composition());
			myFeaturesToSynchronize.add(RobmodPackage.eINSTANCE
					.getComponent_InputPorts());
			myFeaturesToSynchronize.add(RobmodPackage.eINSTANCE
					.getComponent_Properties());
		}
		return myFeaturesToSynchronize;
	}

	/**
	 * @generated
	 */

	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		LinkedList/*[org.eclipse.emf.ecore.EObject]*/result = new LinkedList/*[org.eclipse.emf.ecore.EObject]*/();
		List/*[robmod.robmod.diagram.part.RobmodNodeDescriptor]*/childDescriptors = RobmodDiagramUpdater
				.getComponent_1000SemanticChildren(viewObject);
		for (Iterator/*[robmod.robmod.diagram.part.RobmodNodeDescriptor]*/it = childDescriptors
				.iterator(); it.hasNext();) {
			RobmodNodeDescriptor d = (RobmodNodeDescriptor) it.next();
			result.add(d.getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(
			Collection/*[org.eclipse.emf.ecore.EObject]*/semanticChildren,
			final View view) {
		return isMyDiagramElement(view)
				&& !semanticChildren.contains(view.getElement());
	}

	/**
	 * @generated
	 */
	private boolean isMyDiagramElement(View view) {
		int visualID = RobmodVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case OutputPortEditPart.VISUAL_ID:
		case HandlerEditPart.VISUAL_ID:
		case Component2EditPart.VISUAL_ID:
		case InputPortEditPart.VISUAL_ID:
		case PropertyEditPart.VISUAL_ID:
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void refreshSemantic() {
		if (resolveSemanticElement() == null) {
			return;
		}
		LinkedList/*[org.eclipse.core.runtime.IAdaptable]*/createdViews = new LinkedList/*[org.eclipse.core.runtime.IAdaptable]*/();
		List/*[robmod.robmod.diagram.part.RobmodNodeDescriptor]*/childDescriptors = RobmodDiagramUpdater
				.getComponent_1000SemanticChildren((View) getHost().getModel());
		LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/orphaned = new LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/();
		// we care to check only views we recognize as ours
		LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/knownViewChildren = new LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/();
		for (Iterator/*[org.eclipse.gmf.runtime.notation.View]*/it = getViewChildren()
				.iterator(); it.hasNext();) {
			View v = (View) it.next();
			if (isMyDiagramElement(v)) {
				knownViewChildren.add(v);
			}
		}
		// alternative to #cleanCanonicalSemanticChildren(getViewChildren(), semanticChildren)
		//
		// iteration happens over list of desired semantic elements, trying to find best matching View, while original CEP
		// iterates views, potentially losing view (size/bounds) information - i.e. if there are few views to reference same EObject, only last one 
		// to answer isOrphaned == true will be used for the domain element representation, see #cleanCanonicalSemanticChildren()
		for (Iterator/*[robmod.robmod.diagram.part.RobmodNodeDescriptor]*/descriptorsIterator = childDescriptors
				.iterator(); descriptorsIterator.hasNext();) {
			RobmodNodeDescriptor next = (RobmodNodeDescriptor) descriptorsIterator
					.next();
			String hint = RobmodVisualIDRegistry.getType(next.getVisualID());
			LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/perfectMatch = new LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/(); // both semanticElement and hint match that of NodeDescriptor
			for (Iterator/*[org.eclipse.gmf.runtime.notation.View]*/it = getViewChildren()
					.iterator(); it.hasNext();) {
				View childView = (View) it.next();
				EObject semanticElement = childView.getElement();
				if (next.getModelElement().equals(semanticElement)) {
					if (hint.equals(childView.getType())) {
						perfectMatch.add(childView);
						// actually, can stop iteration over view children here, but
						// may want to use not the first view but last one as a 'real' match (the way original CEP does
						// with its trick with viewToSemanticMap inside #cleanCanonicalSemanticChildren
					}
				}
			}
			if (perfectMatch.size() > 0) {
				descriptorsIterator.remove(); // precise match found no need to create anything for the NodeDescriptor
				// use only one view (first or last?), keep rest as orphaned for further consideration
				knownViewChildren.remove(perfectMatch.getFirst());
			}
		}
		// those left in knownViewChildren are subject to removal - they are our diagram elements we didn't find match to,
		// or those we have potential matches to, and thus need to be recreated, preserving size/location information.
		orphaned.addAll(knownViewChildren);
		//
		ArrayList/*[org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor]*/viewDescriptors = new ArrayList/*[org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor]*/(
				childDescriptors.size());
		for (Iterator/*[robmod.robmod.diagram.part.RobmodNodeDescriptor]*/it = childDescriptors
				.iterator(); it.hasNext();) {
			RobmodNodeDescriptor next = (RobmodNodeDescriptor) it.next();
			String hint = RobmodVisualIDRegistry.getType(next.getVisualID());
			IAdaptable elementAdapter = new CanonicalElementAdapter(
					next.getModelElement(), hint);
			CreateViewRequest.ViewDescriptor descriptor = new CreateViewRequest.ViewDescriptor(
					elementAdapter, Node.class, hint, ViewUtil.APPEND, false,
					host().getDiagramPreferencesHint());
			viewDescriptors.add(descriptor);
		}

		boolean changed = deleteViews(orphaned.iterator());
		//
		CreateViewRequest request = getCreateViewRequest(viewDescriptors);
		Command cmd = getCreateViewCommand(request);
		if (cmd != null && cmd.canExecute()) {
			SetViewMutabilityCommand.makeMutable(
					new EObjectAdapter(host().getNotationView())).execute();
			executeCommand(cmd);

			List/*[org.eclipse.core.runtime.IAdaptable]*/nl = (List/*[org.eclipse.core.runtime.IAdaptable]*/) request
					.getNewObject();
			createdViews.addAll(nl);
		}
		if (changed || createdViews.size() > 0) {
			postProcessRefreshSemantic(createdViews);
		}

		Collection/*[org.eclipse.core.runtime.IAdaptable]*/createdConnectionViews = refreshConnections();

		if (createdViews.size() > 1) {
			// perform a layout of the container
			DeferredLayoutCommand layoutCmd = new DeferredLayoutCommand(host()
					.getEditingDomain(), createdViews, host());
			executeCommand(new ICommandProxy(layoutCmd));
		}

		createdViews.addAll(createdConnectionViews);

		makeViewsImmutable(createdViews);
	}

	/**
	 * @generated
	 */
	private Collection/*[org.eclipse.core.runtime.IAdaptable]*/refreshConnections() {
		Map/*[org.eclipse.emf.ecore.EObject, org.eclipse.gmf.runtime.notation.View]*/domain2NotationMap = new HashMap/*[org.eclipse.emf.ecore.EObject, org.eclipse.gmf.runtime.notation.View]*/();
		Collection/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/linkDescriptors = collectAllLinks(
				getDiagram(), domain2NotationMap);
		Collection existingLinks = new LinkedList(getDiagram().getEdges());
		for (Iterator linksIterator = existingLinks.iterator(); linksIterator
				.hasNext();) {
			Edge nextDiagramLink = (Edge) linksIterator.next();
			int diagramLinkVisualID = RobmodVisualIDRegistry
					.getVisualID(nextDiagramLink);
			if (diagramLinkVisualID == -1) {
				if (nextDiagramLink.getSource() != null
						&& nextDiagramLink.getTarget() != null) {
					linksIterator.remove();
				}
				continue;
			}
			EObject diagramLinkObject = nextDiagramLink.getElement();
			EObject diagramLinkSrc = nextDiagramLink.getSource().getElement();
			EObject diagramLinkDst = nextDiagramLink.getTarget().getElement();
			for (Iterator/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/linkDescriptorsIterator = linkDescriptors
					.iterator(); linkDescriptorsIterator.hasNext();) {
				RobmodLinkDescriptor nextLinkDescriptor = (RobmodLinkDescriptor) linkDescriptorsIterator
						.next();
				if (diagramLinkObject == nextLinkDescriptor.getModelElement()
						&& diagramLinkSrc == nextLinkDescriptor.getSource()
						&& diagramLinkDst == nextLinkDescriptor
								.getDestination()
						&& diagramLinkVisualID == nextLinkDescriptor
								.getVisualID()) {
					linksIterator.remove();
					linkDescriptorsIterator.remove();
					break;
				}
			}
		}
		deleteViews(existingLinks.iterator());
		return createConnections(linkDescriptors, domain2NotationMap);
	}

	/**
	 * @generated
	 */
	private Collection/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/collectAllLinks(
			View view,
			Map/*[org.eclipse.emf.ecore.EObject, org.eclipse.gmf.runtime.notation.View]*/domain2NotationMap) {
		if (!ComponentEditPart.MODEL_ID.equals(RobmodVisualIDRegistry
				.getModelID(view))) {
			return Collections.EMPTY_LIST;
		}
		LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/result = new LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/();
		switch (RobmodVisualIDRegistry.getVisualID(view)) {
		case ComponentEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(RobmodDiagramUpdater
						.getComponent_1000ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case OutputPortEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(RobmodDiagramUpdater
						.getOutputPort_2001ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case HandlerEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(RobmodDiagramUpdater
						.getHandler_2002ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case Component2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(RobmodDiagramUpdater
						.getComponent_2003ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case InputPortEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(RobmodDiagramUpdater
						.getInputPort_2004ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case PropertyEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(RobmodDiagramUpdater
						.getProperty_2005ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case InputPort2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(RobmodDiagramUpdater
						.getInputPort_3001ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case OutputPort2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(RobmodDiagramUpdater
						.getOutputPort_3002ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		}
		for (Iterator children = view.getChildren().iterator(); children
				.hasNext();) {
			result.addAll(collectAllLinks((View) children.next(),
					domain2NotationMap));
		}
		for (Iterator edges = view.getSourceEdges().iterator(); edges.hasNext();) {
			result.addAll(collectAllLinks((View) edges.next(),
					domain2NotationMap));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection/*[org.eclipse.core.runtime.IAdaptable]*/createConnections(
			Collection/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/linkDescriptors,
			Map/*[org.eclipse.emf.ecore.EObject, org.eclipse.gmf.runtime.notation.View]*/domain2NotationMap) {
		LinkedList/*[org.eclipse.core.runtime.IAdaptable]*/adapters = new LinkedList/*[org.eclipse.core.runtime.IAdaptable]*/();
		for (Iterator/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/it = linkDescriptors
				.iterator(); it.hasNext();) {
			RobmodLinkDescriptor nextLinkDescriptor = (RobmodLinkDescriptor) it
					.next();
			EditPart sourceEditPart = getEditPart(
					nextLinkDescriptor.getSource(), domain2NotationMap);
			EditPart targetEditPart = getEditPart(
					nextLinkDescriptor.getDestination(), domain2NotationMap);
			if (sourceEditPart == null || targetEditPart == null) {
				continue;
			}
			CreateConnectionViewRequest.ConnectionViewDescriptor descriptor = new CreateConnectionViewRequest.ConnectionViewDescriptor(
					nextLinkDescriptor.getSemanticAdapter(),
					RobmodVisualIDRegistry.getType(nextLinkDescriptor
							.getVisualID()), ViewUtil.APPEND, false,
					((IGraphicalEditPart) getHost())
							.getDiagramPreferencesHint());
			CreateConnectionViewRequest ccr = new CreateConnectionViewRequest(
					descriptor);
			ccr.setType(RequestConstants.REQ_CONNECTION_START);
			ccr.setSourceEditPart(sourceEditPart);
			sourceEditPart.getCommand(ccr);
			ccr.setTargetEditPart(targetEditPart);
			ccr.setType(RequestConstants.REQ_CONNECTION_END);
			Command cmd = targetEditPart.getCommand(ccr);
			if (cmd != null && cmd.canExecute()) {
				executeCommand(cmd);
				IAdaptable viewAdapter = (IAdaptable) ccr.getNewObject();
				if (viewAdapter != null) {
					adapters.add(viewAdapter);
				}
			}
		}
		return adapters;
	}

	/**
	 * @generated
	 */
	private EditPart getEditPart(
			EObject domainModelElement,
			Map/*[org.eclipse.emf.ecore.EObject, org.eclipse.gmf.runtime.notation.View]*/domain2NotationMap) {
		View view = (View) domain2NotationMap.get(domainModelElement);
		if (view != null) {
			return (EditPart) getHost().getViewer().getEditPartRegistry()
					.get(view);
		}
		return null;
	}

	/**
	 * @generated
	 */
	private Diagram getDiagram() {
		return ((View) getHost().getModel()).getDiagram();
	}
}
