package robmod.robmod.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import robmod.robmod.diagram.edit.commands.HandlerTrigeredByCreateCommand;
import robmod.robmod.diagram.edit.commands.HandlerTrigeredByReorientCommand;
import robmod.robmod.diagram.edit.commands.InputPortPropagationCreateCommand;
import robmod.robmod.diagram.edit.commands.InputPortPropagationReorientCommand;
import robmod.robmod.diagram.edit.commands.OutputPortConnectionCreateCommand;
import robmod.robmod.diagram.edit.commands.OutputPortConnectionReorientCommand;
import robmod.robmod.diagram.edit.parts.HandlerTrigeredByEditPart;
import robmod.robmod.diagram.edit.parts.InputPortPropagationEditPart;
import robmod.robmod.diagram.edit.parts.OutputPortConnectionEditPart;
import robmod.robmod.diagram.part.RobmodVisualIDRegistry;
import robmod.robmod.diagram.providers.RobmodElementTypes;

/**
 * @generated
 */
public class InputPortItemSemanticEditPolicy extends
		RobmodBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InputPortItemSemanticEditPolicy() {
		super(RobmodElementTypes.InputPort_2004);
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
			if (RobmodVisualIDRegistry.getVisualID(incomingLink) == HandlerTrigeredByEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (RobmodVisualIDRegistry.getVisualID(incomingLink) == OutputPortConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (RobmodVisualIDRegistry.getVisualID(incomingLink) == InputPortPropagationEditPart.VISUAL_ID) {
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
			if (RobmodVisualIDRegistry.getVisualID(outgoingLink) == InputPortPropagationEditPart.VISUAL_ID) {
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
		if (RobmodElementTypes.HandlerTrigeredBy_4004 == req.getElementType()) {
			return null;
		}
		if (RobmodElementTypes.OutputPortConnection_4005 == req
				.getElementType()) {
			return null;
		}
		if (RobmodElementTypes.InputPortPropagation_4007 == req
				.getElementType()) {
			return getGEFWrapper(new InputPortPropagationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (RobmodElementTypes.HandlerTrigeredBy_4004 == req.getElementType()) {
			return getGEFWrapper(new HandlerTrigeredByCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (RobmodElementTypes.OutputPortConnection_4005 == req
				.getElementType()) {
			return getGEFWrapper(new OutputPortConnectionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (RobmodElementTypes.InputPortPropagation_4007 == req
				.getElementType()) {
			return getGEFWrapper(new InputPortPropagationCreateCommand(req,
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
		case HandlerTrigeredByEditPart.VISUAL_ID:
			return getGEFWrapper(new HandlerTrigeredByReorientCommand(req));
		case OutputPortConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new OutputPortConnectionReorientCommand(req));
		case InputPortPropagationEditPart.VISUAL_ID:
			return getGEFWrapper(new InputPortPropagationReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
