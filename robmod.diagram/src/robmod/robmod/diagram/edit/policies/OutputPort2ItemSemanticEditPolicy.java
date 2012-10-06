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

import robmod.robmod.diagram.edit.commands.HandlerGeneratesCreateCommand;
import robmod.robmod.diagram.edit.commands.HandlerGeneratesReorientCommand;
import robmod.robmod.diagram.edit.commands.OutputPortConnectionCreateCommand;
import robmod.robmod.diagram.edit.commands.OutputPortConnectionReorientCommand;
import robmod.robmod.diagram.edit.commands.OutputPortDelegationCreateCommand;
import robmod.robmod.diagram.edit.commands.OutputPortDelegationReorientCommand;
import robmod.robmod.diagram.edit.parts.HandlerGeneratesEditPart;
import robmod.robmod.diagram.edit.parts.OutputPortConnectionEditPart;
import robmod.robmod.diagram.edit.parts.OutputPortDelegationEditPart;
import robmod.robmod.diagram.part.RobmodVisualIDRegistry;
import robmod.robmod.diagram.providers.RobmodElementTypes;

/**
 * @generated
 */
public class OutputPort2ItemSemanticEditPolicy extends
		RobmodBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OutputPort2ItemSemanticEditPolicy() {
		super(RobmodElementTypes.OutputPort_3002);
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
			if (RobmodVisualIDRegistry.getVisualID(incomingLink) == OutputPortDelegationEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (RobmodVisualIDRegistry.getVisualID(incomingLink) == HandlerGeneratesEditPart.VISUAL_ID) {
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
			if (RobmodVisualIDRegistry.getVisualID(outgoingLink) == OutputPortConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (RobmodVisualIDRegistry.getVisualID(outgoingLink) == OutputPortDelegationEditPart.VISUAL_ID) {
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
		if (RobmodElementTypes.OutputPortConnection_4005 == req
				.getElementType()) {
			return getGEFWrapper(new OutputPortConnectionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (RobmodElementTypes.OutputPortDelegation_4006 == req
				.getElementType()) {
			return getGEFWrapper(new OutputPortDelegationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (RobmodElementTypes.HandlerGenerates_4008 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (RobmodElementTypes.OutputPortConnection_4005 == req
				.getElementType()) {
			return null;
		}
		if (RobmodElementTypes.OutputPortDelegation_4006 == req
				.getElementType()) {
			return getGEFWrapper(new OutputPortDelegationCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (RobmodElementTypes.HandlerGenerates_4008 == req.getElementType()) {
			return getGEFWrapper(new HandlerGeneratesCreateCommand(req,
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
		case OutputPortConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new OutputPortConnectionReorientCommand(req));
		case OutputPortDelegationEditPart.VISUAL_ID:
			return getGEFWrapper(new OutputPortDelegationReorientCommand(req));
		case HandlerGeneratesEditPart.VISUAL_ID:
			return getGEFWrapper(new HandlerGeneratesReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
