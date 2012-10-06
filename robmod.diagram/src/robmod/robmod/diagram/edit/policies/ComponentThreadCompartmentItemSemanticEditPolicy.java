package robmod.robmod.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import robmod.robmod.diagram.edit.commands.Component4CreateCommand;
import robmod.robmod.diagram.providers.RobmodElementTypes;

/**
 * @generated
 */
public class ComponentThreadCompartmentItemSemanticEditPolicy extends
		RobmodBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentThreadCompartmentItemSemanticEditPolicy() {
		super(RobmodElementTypes.Component_2007);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RobmodElementTypes.Component_3003 == req.getElementType()) {
			return getGEFWrapper(new Component4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
