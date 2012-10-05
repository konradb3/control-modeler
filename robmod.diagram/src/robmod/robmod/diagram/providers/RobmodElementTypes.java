package robmod.robmod.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import robmod.robmod.RobmodPackage;
import robmod.robmod.diagram.edit.parts.Component2EditPart;
import robmod.robmod.diagram.edit.parts.ComponentEditPart;
import robmod.robmod.diagram.edit.parts.HandlerEditPart;
import robmod.robmod.diagram.edit.parts.HandlerTrigeredByEditPart;
import robmod.robmod.diagram.edit.parts.InputPort2EditPart;
import robmod.robmod.diagram.edit.parts.InputPortEditPart;
import robmod.robmod.diagram.edit.parts.InputPortPropagationEditPart;
import robmod.robmod.diagram.edit.parts.OutputPort2EditPart;
import robmod.robmod.diagram.edit.parts.OutputPortConnectionEditPart;
import robmod.robmod.diagram.edit.parts.OutputPortDelegationEditPart;
import robmod.robmod.diagram.edit.parts.OutputPortEditPart;
import robmod.robmod.diagram.edit.parts.PropertyEditPart;
import robmod.robmod.diagram.part.RobmodDiagramEditorPlugin;

/**
 * @generated
 */
public class RobmodElementTypes {

	/**
	 * @generated
	 */
	private RobmodElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map/*[org.eclipse.gmf.runtime.emf.type.core.IElementType, org.eclipse.emf.ecore.ENamedElement]*/elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Component_1000 = getElementType("robmod.diagram.Component_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OutputPort_2001 = getElementType("robmod.diagram.OutputPort_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Handler_2002 = getElementType("robmod.diagram.Handler_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Component_2003 = getElementType("robmod.diagram.Component_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InputPort_2004 = getElementType("robmod.diagram.InputPort_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Property_2005 = getElementType("robmod.diagram.Property_2005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InputPort_3001 = getElementType("robmod.diagram.InputPort_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OutputPort_3002 = getElementType("robmod.diagram.OutputPort_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HandlerTrigeredBy_4004 = getElementType("robmod.diagram.HandlerTrigeredBy_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OutputPortConnection_4005 = getElementType("robmod.diagram.OutputPortConnection_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OutputPortDelegation_4006 = getElementType("robmod.diagram.OutputPortDelegation_4006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InputPortPropagation_4007 = getElementType("robmod.diagram.InputPortPropagation_4007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return RobmodDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap/*[org.eclipse.gmf.runtime.emf.type.core.IElementType, org.eclipse.emf.ecore.ENamedElement]*/();

			elements.put(Component_1000, RobmodPackage.eINSTANCE.getComponent());

			elements.put(OutputPort_2001,
					RobmodPackage.eINSTANCE.getOutputPort());

			elements.put(Handler_2002, RobmodPackage.eINSTANCE.getHandler());

			elements.put(Component_2003, RobmodPackage.eINSTANCE.getComponent());

			elements.put(InputPort_2004, RobmodPackage.eINSTANCE.getInputPort());

			elements.put(Property_2005, RobmodPackage.eINSTANCE.getProperty());

			elements.put(InputPort_3001, RobmodPackage.eINSTANCE.getInputPort());

			elements.put(OutputPort_3002,
					RobmodPackage.eINSTANCE.getOutputPort());

			elements.put(HandlerTrigeredBy_4004,
					RobmodPackage.eINSTANCE.getHandler_TrigeredBy());

			elements.put(OutputPortConnection_4005,
					RobmodPackage.eINSTANCE.getOutputPort_Connection());

			elements.put(OutputPortDelegation_4006,
					RobmodPackage.eINSTANCE.getOutputPort_Delegation());

			elements.put(InputPortPropagation_4007,
					RobmodPackage.eINSTANCE.getInputPort_Propagation());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/();
			KNOWN_ELEMENT_TYPES.add(Component_1000);
			KNOWN_ELEMENT_TYPES.add(OutputPort_2001);
			KNOWN_ELEMENT_TYPES.add(Handler_2002);
			KNOWN_ELEMENT_TYPES.add(Component_2003);
			KNOWN_ELEMENT_TYPES.add(InputPort_2004);
			KNOWN_ELEMENT_TYPES.add(Property_2005);
			KNOWN_ELEMENT_TYPES.add(InputPort_3001);
			KNOWN_ELEMENT_TYPES.add(OutputPort_3002);
			KNOWN_ELEMENT_TYPES.add(HandlerTrigeredBy_4004);
			KNOWN_ELEMENT_TYPES.add(OutputPortConnection_4005);
			KNOWN_ELEMENT_TYPES.add(OutputPortDelegation_4006);
			KNOWN_ELEMENT_TYPES.add(InputPortPropagation_4007);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ComponentEditPart.VISUAL_ID:
			return Component_1000;
		case OutputPortEditPart.VISUAL_ID:
			return OutputPort_2001;
		case HandlerEditPart.VISUAL_ID:
			return Handler_2002;
		case Component2EditPart.VISUAL_ID:
			return Component_2003;
		case InputPortEditPart.VISUAL_ID:
			return InputPort_2004;
		case PropertyEditPart.VISUAL_ID:
			return Property_2005;
		case InputPort2EditPart.VISUAL_ID:
			return InputPort_3001;
		case OutputPort2EditPart.VISUAL_ID:
			return OutputPort_3002;
		case HandlerTrigeredByEditPart.VISUAL_ID:
			return HandlerTrigeredBy_4004;
		case OutputPortConnectionEditPart.VISUAL_ID:
			return OutputPortConnection_4005;
		case OutputPortDelegationEditPart.VISUAL_ID:
			return OutputPortDelegation_4006;
		case InputPortPropagationEditPart.VISUAL_ID:
			return InputPortPropagation_4007;
		}
		return null;
	}

}
