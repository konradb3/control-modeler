package robmod.robmod.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import robmod.robmod.diagram.part.RobmodVisualIDRegistry;

/**
 * @generated
 */
public class RobmodEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (RobmodVisualIDRegistry.getVisualID(view)) {

			case ComponentEditPart.VISUAL_ID:
				return new ComponentEditPart(view);

			case OutputPortEditPart.VISUAL_ID:
				return new OutputPortEditPart(view);

			case OutputPortDataTypeEditPart.VISUAL_ID:
				return new OutputPortDataTypeEditPart(view);

			case HandlerEditPart.VISUAL_ID:
				return new HandlerEditPart(view);

			case HandlerNameEditPart.VISUAL_ID:
				return new HandlerNameEditPart(view);

			case Component2EditPart.VISUAL_ID:
				return new Component2EditPart(view);

			case ComponentNameEditPart.VISUAL_ID:
				return new ComponentNameEditPart(view);

			case ComponentTypeEditPart.VISUAL_ID:
				return new ComponentTypeEditPart(view);

			case InputPortEditPart.VISUAL_ID:
				return new InputPortEditPart(view);

			case InputPortDataTypeEditPart.VISUAL_ID:
				return new InputPortDataTypeEditPart(view);

			case PropertyEditPart.VISUAL_ID:
				return new PropertyEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case Component3EditPart.VISUAL_ID:
				return new Component3EditPart(view);

			case ComponentDescriptionEditPart.VISUAL_ID:
				return new ComponentDescriptionEditPart(view);

			case ComponentType2EditPart.VISUAL_ID:
				return new ComponentType2EditPart(view);

			case InputPort2EditPart.VISUAL_ID:
				return new InputPort2EditPart(view);

			case InputPortNameEditPart.VISUAL_ID:
				return new InputPortNameEditPart(view);

			case OutputPort2EditPart.VISUAL_ID:
				return new OutputPort2EditPart(view);

			case OutputPortNameEditPart.VISUAL_ID:
				return new OutputPortNameEditPart(view);

			case HandlerTrigeredByEditPart.VISUAL_ID:
				return new HandlerTrigeredByEditPart(view);

			case OutputPortConnectionEditPart.VISUAL_ID:
				return new OutputPortConnectionEditPart(view);

			case OutputPortDelegationEditPart.VISUAL_ID:
				return new OutputPortDelegationEditPart(view);

			case InputPortPropagationEditPart.VISUAL_ID:
				return new InputPortPropagationEditPart(view);

			case HandlerGeneratesEditPart.VISUAL_ID:
				return new HandlerGeneratesEditPart(view);

			case ComponentBeforeEditPart.VISUAL_ID:
				return new ComponentBeforeEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
