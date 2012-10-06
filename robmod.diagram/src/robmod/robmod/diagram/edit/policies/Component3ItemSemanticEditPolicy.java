package robmod.robmod.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import robmod.robmod.diagram.edit.commands.ComponentBeforeCreateCommand;
import robmod.robmod.diagram.edit.commands.ComponentBeforeReorientCommand;
import robmod.robmod.diagram.edit.commands.InputPort2CreateCommand;
import robmod.robmod.diagram.edit.commands.OutputPort2CreateCommand;
import robmod.robmod.diagram.edit.parts.ComponentBeforeEditPart;
import robmod.robmod.diagram.edit.parts.HandlerGeneratesEditPart;
import robmod.robmod.diagram.edit.parts.HandlerTrigeredByEditPart;
import robmod.robmod.diagram.edit.parts.InputPort2EditPart;
import robmod.robmod.diagram.edit.parts.InputPortPropagationEditPart;
import robmod.robmod.diagram.edit.parts.OutputPort2EditPart;
import robmod.robmod.diagram.edit.parts.OutputPortConnectionEditPart;
import robmod.robmod.diagram.edit.parts.OutputPortDelegationEditPart;
import robmod.robmod.diagram.part.RobmodVisualIDRegistry;
import robmod.robmod.diagram.providers.RobmodElementTypes;

/**
 * @generated
 */
public class Component3ItemSemanticEditPolicy extends
		RobmodBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Component3ItemSemanticEditPolicy() {
		super(RobmodElementTypes.Component_2006);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RobmodElementTypes.InputPort_3001 == req.getElementType()) {
			return getGEFWrapper(new InputPort2CreateCommand(req));
		}
		if (RobmodElementTypes.OutputPort_3002 == req.getElementType()) {
			return getGEFWrapper(new OutputPort2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator/*[?]*/it = view.getTargetEdges().iterator(); it
				.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (RobmodVisualIDRegistry.getVisualID(incomingLink) == ComponentBeforeEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator/*[?]*/it = view.getSourceEdges().iterator(); it
				.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (RobmodVisualIDRegistry.getVisualID(outgoingLink) == ComponentBeforeEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator/*[?]*/nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (RobmodVisualIDRegistry.getVisualID(node)) {
			case InputPort2EditPart.VISUAL_ID:
				for (Iterator/*[?]*/it = node.getTargetEdges().iterator(); it
						.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (RobmodVisualIDRegistry.getVisualID(incomingLink) == HandlerTrigeredByEditPart.VISUAL_ID) {
						DestroyReferenceRequest r = new DestroyReferenceRequest(
								incomingLink.getSource().getElement(), null,
								incomingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (RobmodVisualIDRegistry.getVisualID(incomingLink) == OutputPortConnectionEditPart.VISUAL_ID) {
						DestroyReferenceRequest r = new DestroyReferenceRequest(
								incomingLink.getSource().getElement(), null,
								incomingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (RobmodVisualIDRegistry.getVisualID(incomingLink) == InputPortPropagationEditPart.VISUAL_ID) {
						DestroyReferenceRequest r = new DestroyReferenceRequest(
								incomingLink.getSource().getElement(), null,
								incomingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
				}
				for (Iterator/*[?]*/it = node.getSourceEdges().iterator(); it
						.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (RobmodVisualIDRegistry.getVisualID(outgoingLink) == InputPortPropagationEditPart.VISUAL_ID) {
						DestroyReferenceRequest r = new DestroyReferenceRequest(
								outgoingLink.getSource().getElement(), null,
								outgoingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case OutputPort2EditPart.VISUAL_ID:
				for (Iterator/*[?]*/it = node.getTargetEdges().iterator(); it
						.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (RobmodVisualIDRegistry.getVisualID(incomingLink) == OutputPortDelegationEditPart.VISUAL_ID) {
						DestroyReferenceRequest r = new DestroyReferenceRequest(
								incomingLink.getSource().getElement(), null,
								incomingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
					if (RobmodVisualIDRegistry.getVisualID(incomingLink) == HandlerGeneratesEditPart.VISUAL_ID) {
						DestroyReferenceRequest r = new DestroyReferenceRequest(
								incomingLink.getSource().getElement(), null,
								incomingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								incomingLink));
						continue;
					}
				}
				for (Iterator/*[?]*/it = node.getSourceEdges().iterator(); it
						.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (RobmodVisualIDRegistry.getVisualID(outgoingLink) == OutputPortConnectionEditPart.VISUAL_ID) {
						DestroyReferenceRequest r = new DestroyReferenceRequest(
								outgoingLink.getSource().getElement(), null,
								outgoingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
					if (RobmodVisualIDRegistry.getVisualID(outgoingLink) == OutputPortDelegationEditPart.VISUAL_ID) {
						DestroyReferenceRequest r = new DestroyReferenceRequest(
								outgoingLink.getSource().getElement(), null,
								outgoingLink.getTarget().getElement(), false);
						cmd.add(new DestroyReferenceCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(),
								outgoingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (RobmodElementTypes.ComponentBefore_4009 == req.getElementType()) {
			return getGEFWrapper(new ComponentBeforeCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (RobmodElementTypes.ComponentBefore_4009 == req.getElementType()) {
			return getGEFWrapper(new ComponentBeforeCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ComponentBeforeEditPart.VISUAL_ID:
			return getGEFWrapper(new ComponentBeforeReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
