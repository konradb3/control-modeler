package robmod.robmod.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import robmod.robmod.Component;
import robmod.robmod.RobmodPackage;
import robmod.robmod.diagram.edit.parts.Component2EditPart;
import robmod.robmod.diagram.edit.parts.Component3EditPart;
import robmod.robmod.diagram.edit.parts.ComponentDescriptionEditPart;
import robmod.robmod.diagram.edit.parts.ComponentEditPart;
import robmod.robmod.diagram.edit.parts.ComponentNameEditPart;
import robmod.robmod.diagram.edit.parts.ComponentType2EditPart;
import robmod.robmod.diagram.edit.parts.ComponentTypeEditPart;
import robmod.robmod.diagram.edit.parts.HandlerEditPart;
import robmod.robmod.diagram.edit.parts.HandlerNameEditPart;
import robmod.robmod.diagram.edit.parts.InputPort2EditPart;
import robmod.robmod.diagram.edit.parts.InputPortDataType2EditPart;
import robmod.robmod.diagram.edit.parts.InputPortDataTypeEditPart;
import robmod.robmod.diagram.edit.parts.InputPortEditPart;
import robmod.robmod.diagram.edit.parts.InputPortNameEditPart;
import robmod.robmod.diagram.edit.parts.OutputPort2EditPart;
import robmod.robmod.diagram.edit.parts.OutputPortDataType2EditPart;
import robmod.robmod.diagram.edit.parts.OutputPortDataTypeEditPart;
import robmod.robmod.diagram.edit.parts.OutputPortEditPart;
import robmod.robmod.diagram.edit.parts.OutputPortNameEditPart;
import robmod.robmod.diagram.edit.parts.PropertyEditPart;
import robmod.robmod.diagram.edit.parts.WrappingLabel2EditPart;
import robmod.robmod.diagram.edit.parts.WrappingLabelEditPart;
import robmod.robmod.diagram.expressions.RobmodOCLFactory;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class RobmodVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "robmod.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ComponentEditPart.MODEL_ID.equals(view.getType())) {
				return ComponentEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return robmod.robmod.diagram.part.RobmodVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				RobmodDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (RobmodPackage.eINSTANCE.getComponent().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Component) domainElement)) {
			return ComponentEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = robmod.robmod.diagram.part.RobmodVisualIDRegistry
				.getModelID(containerView);
		if (!ComponentEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ComponentEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = robmod.robmod.diagram.part.RobmodVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ComponentEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ComponentEditPart.VISUAL_ID:
			if (RobmodPackage.eINSTANCE.getOutputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return OutputPortEditPart.VISUAL_ID;
			}
			if (RobmodPackage.eINSTANCE.getHandler().isSuperTypeOf(
					domainElement.eClass())) {
				return HandlerEditPart.VISUAL_ID;
			}
			if (RobmodPackage.eINSTANCE.getComponent().isSuperTypeOf(
					domainElement.eClass())
					&& isComponent_2003((Component) domainElement)) {
				return Component2EditPart.VISUAL_ID;
			}
			if (RobmodPackage.eINSTANCE.getInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return InputPortEditPart.VISUAL_ID;
			}
			if (RobmodPackage.eINSTANCE.getProperty().isSuperTypeOf(
					domainElement.eClass())) {
				return PropertyEditPart.VISUAL_ID;
			}
			if (RobmodPackage.eINSTANCE.getComponent().isSuperTypeOf(
					domainElement.eClass())
					&& isComponent_2006((Component) domainElement)) {
				return Component3EditPart.VISUAL_ID;
			}
			break;
		case Component2EditPart.VISUAL_ID:
			if (RobmodPackage.eINSTANCE.getInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return InputPort2EditPart.VISUAL_ID;
			}
			if (RobmodPackage.eINSTANCE.getOutputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return OutputPort2EditPart.VISUAL_ID;
			}
			break;
		case Component3EditPart.VISUAL_ID:
			if (RobmodPackage.eINSTANCE.getInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return InputPort2EditPart.VISUAL_ID;
			}
			if (RobmodPackage.eINSTANCE.getOutputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return OutputPort2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = robmod.robmod.diagram.part.RobmodVisualIDRegistry
				.getModelID(containerView);
		if (!ComponentEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ComponentEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = robmod.robmod.diagram.part.RobmodVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ComponentEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ComponentEditPart.VISUAL_ID:
			if (OutputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HandlerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Component2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Component3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutputPortEditPart.VISUAL_ID:
			if (OutputPortDataTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HandlerEditPart.VISUAL_ID:
			if (HandlerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Component2EditPart.VISUAL_ID:
			if (ComponentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponentTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputPortEditPart.VISUAL_ID:
			if (InputPortDataTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PropertyEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Component3EditPart.VISUAL_ID:
			if (ComponentDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponentType2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputPort2EditPart.VISUAL_ID:
			if (InputPortNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutputPort2EditPart.VISUAL_ID:
			if (OutputPortNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Component element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static boolean isComponent_2003(Component domainElement) {
		Object result = RobmodOCLFactory.getExpression(0,
				RobmodPackage.eINSTANCE.getComponent(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isComponent_2006(Component domainElement) {
		Object result = RobmodOCLFactory.getExpression(1,
				RobmodPackage.eINSTANCE.getComponent(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ComponentEditPart.VISUAL_ID:
			return false;
		case OutputPortEditPart.VISUAL_ID:
		case HandlerEditPart.VISUAL_ID:
		case InputPortEditPart.VISUAL_ID:
		case PropertyEditPart.VISUAL_ID:
		case InputPort2EditPart.VISUAL_ID:
		case OutputPort2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */

		public int getVisualID(View view) {
			return robmod.robmod.diagram.part.RobmodVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */

		public String getModelID(View view) {
			return robmod.robmod.diagram.part.RobmodVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return robmod.robmod.diagram.part.RobmodVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */

		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return robmod.robmod.diagram.part.RobmodVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */

		public boolean isCompartmentVisualID(int visualID) {
			return robmod.robmod.diagram.part.RobmodVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */

		public boolean isSemanticLeafVisualID(int visualID) {
			return robmod.robmod.diagram.part.RobmodVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
