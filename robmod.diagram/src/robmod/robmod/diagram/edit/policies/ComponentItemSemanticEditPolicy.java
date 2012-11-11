package robmod.robmod.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import robmod.robmod.diagram.edit.commands.Component2CreateCommand;
import robmod.robmod.diagram.edit.commands.ComponentCreateCommand;
import robmod.robmod.diagram.edit.commands.HandlerCreateCommand;
import robmod.robmod.diagram.edit.commands.InputPortCreateCommand;
import robmod.robmod.diagram.edit.commands.OutputPortCreateCommand;
import robmod.robmod.diagram.edit.commands.PropertyCreateCommand;
import robmod.robmod.diagram.providers.RobmodElementTypes;

/**
 * @generated
 */
public class ComponentItemSemanticEditPolicy extends
		RobmodBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentItemSemanticEditPolicy() {
		super(RobmodElementTypes.Component_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RobmodElementTypes.OutputPort_2001 == req.getElementType()) {
			return getGEFWrapper(new OutputPortCreateCommand(req));
		}
		if (RobmodElementTypes.Handler_2002 == req.getElementType()) {
			return getGEFWrapper(new HandlerCreateCommand(req));
		}
		if (RobmodElementTypes.Component_2003 == req.getElementType()) {
			return getGEFWrapper(new ComponentCreateCommand(req));
		}
		if (RobmodElementTypes.InputPort_2004 == req.getElementType()) {
			return getGEFWrapper(new InputPortCreateCommand(req));
		}
		if (RobmodElementTypes.Property_2005 == req.getElementType()) {
			return getGEFWrapper(new PropertyCreateCommand(req));
		}
		if (RobmodElementTypes.Component_2006 == req.getElementType()) {
			return getGEFWrapper(new Component2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
