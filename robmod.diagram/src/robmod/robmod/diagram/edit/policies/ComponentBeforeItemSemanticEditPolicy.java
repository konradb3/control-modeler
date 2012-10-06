package robmod.robmod.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import robmod.robmod.diagram.providers.RobmodElementTypes;

/**
 * @generated
 */
public class ComponentBeforeItemSemanticEditPolicy extends
		RobmodBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentBeforeItemSemanticEditPolicy() {
		super(RobmodElementTypes.ComponentBefore_4009);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
