package robmod.robmod.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import robmod.robmod.Component;
import robmod.robmod.Handler;
import robmod.robmod.InputPort;
import robmod.robmod.OutputPort;
import robmod.robmod.Property;
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
import robmod.robmod.diagram.providers.RobmodElementTypes;

/**
 * @generated
 */
public class RobmodDiagramUpdater {

	/**
	 * @generated
	 */
	public static List/*[robmod.robmod.diagram.part.RobmodNodeDescriptor]*/getSemanticChildren(
			View view) {
		switch (RobmodVisualIDRegistry.getVisualID(view)) {
		case ComponentEditPart.VISUAL_ID:
			return getComponent_1000SemanticChildren(view);
		case Component2EditPart.VISUAL_ID:
			return getComponent_2003SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[robmod.robmod.diagram.part.RobmodNodeDescriptor]*/getComponent_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Component modelElement = (Component) view.getElement();
		LinkedList/*[robmod.robmod.diagram.part.RobmodNodeDescriptor]*/result = new LinkedList/*[robmod.robmod.diagram.part.RobmodNodeDescriptor]*/();
		for (Iterator/*[?]*/it = modelElement.getOutputPorts().iterator(); it
				.hasNext();) {
			OutputPort childElement = (OutputPort) it.next();
			int visualID = RobmodVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OutputPortEditPart.VISUAL_ID) {
				result.add(new RobmodNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator/*[?]*/it = modelElement.getHandlers().iterator(); it
				.hasNext();) {
			Handler childElement = (Handler) it.next();
			int visualID = RobmodVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == HandlerEditPart.VISUAL_ID) {
				result.add(new RobmodNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator/*[?]*/it = modelElement.getComposition().iterator(); it
				.hasNext();) {
			Component childElement = (Component) it.next();
			int visualID = RobmodVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Component2EditPart.VISUAL_ID) {
				result.add(new RobmodNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator/*[?]*/it = modelElement.getInputPorts().iterator(); it
				.hasNext();) {
			InputPort childElement = (InputPort) it.next();
			int visualID = RobmodVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InputPortEditPart.VISUAL_ID) {
				result.add(new RobmodNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator/*[?]*/it = modelElement.getProperties().iterator(); it
				.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = RobmodVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PropertyEditPart.VISUAL_ID) {
				result.add(new RobmodNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[robmod.robmod.diagram.part.RobmodNodeDescriptor]*/getComponent_2003SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Component modelElement = (Component) view.getElement();
		LinkedList/*[robmod.robmod.diagram.part.RobmodNodeDescriptor]*/result = new LinkedList/*[robmod.robmod.diagram.part.RobmodNodeDescriptor]*/();
		for (Iterator/*[?]*/it = modelElement.getInputPorts().iterator(); it
				.hasNext();) {
			InputPort childElement = (InputPort) it.next();
			int visualID = RobmodVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InputPort2EditPart.VISUAL_ID) {
				result.add(new RobmodNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator/*[?]*/it = modelElement.getOutputPorts().iterator(); it
				.hasNext();) {
			OutputPort childElement = (OutputPort) it.next();
			int visualID = RobmodVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OutputPort2EditPart.VISUAL_ID) {
				result.add(new RobmodNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getContainedLinks(
			View view) {
		switch (RobmodVisualIDRegistry.getVisualID(view)) {
		case ComponentEditPart.VISUAL_ID:
			return getComponent_1000ContainedLinks(view);
		case OutputPortEditPart.VISUAL_ID:
			return getOutputPort_2001ContainedLinks(view);
		case HandlerEditPart.VISUAL_ID:
			return getHandler_2002ContainedLinks(view);
		case Component2EditPart.VISUAL_ID:
			return getComponent_2003ContainedLinks(view);
		case InputPortEditPart.VISUAL_ID:
			return getInputPort_2004ContainedLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_2005ContainedLinks(view);
		case InputPort2EditPart.VISUAL_ID:
			return getInputPort_3001ContainedLinks(view);
		case OutputPort2EditPart.VISUAL_ID:
			return getOutputPort_3002ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getIncomingLinks(
			View view) {
		switch (RobmodVisualIDRegistry.getVisualID(view)) {
		case OutputPortEditPart.VISUAL_ID:
			return getOutputPort_2001IncomingLinks(view);
		case HandlerEditPart.VISUAL_ID:
			return getHandler_2002IncomingLinks(view);
		case Component2EditPart.VISUAL_ID:
			return getComponent_2003IncomingLinks(view);
		case InputPortEditPart.VISUAL_ID:
			return getInputPort_2004IncomingLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_2005IncomingLinks(view);
		case InputPort2EditPart.VISUAL_ID:
			return getInputPort_3001IncomingLinks(view);
		case OutputPort2EditPart.VISUAL_ID:
			return getOutputPort_3002IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getOutgoingLinks(
			View view) {
		switch (RobmodVisualIDRegistry.getVisualID(view)) {
		case OutputPortEditPart.VISUAL_ID:
			return getOutputPort_2001OutgoingLinks(view);
		case HandlerEditPart.VISUAL_ID:
			return getHandler_2002OutgoingLinks(view);
		case Component2EditPart.VISUAL_ID:
			return getComponent_2003OutgoingLinks(view);
		case InputPortEditPart.VISUAL_ID:
			return getInputPort_2004OutgoingLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_2005OutgoingLinks(view);
		case InputPort2EditPart.VISUAL_ID:
			return getInputPort_3001OutgoingLinks(view);
		case OutputPort2EditPart.VISUAL_ID:
			return getOutputPort_3002OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getComponent_1000ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getOutputPort_2001ContainedLinks(
			View view) {
		OutputPort modelElement = (OutputPort) view.getElement();
		LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/result = new LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/();
		result.addAll(getOutgoingFeatureModelFacetLinks_OutputPort_Connection_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OutputPort_Delegation_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getHandler_2002ContainedLinks(
			View view) {
		Handler modelElement = (Handler) view.getElement();
		LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/result = new LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/();
		result.addAll(getOutgoingFeatureModelFacetLinks_Handler_TrigeredBy_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getComponent_2003ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getInputPort_2004ContainedLinks(
			View view) {
		InputPort modelElement = (InputPort) view.getElement();
		LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/result = new LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/();
		result.addAll(getOutgoingFeatureModelFacetLinks_InputPort_Propagation_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getProperty_2005ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getInputPort_3001ContainedLinks(
			View view) {
		InputPort modelElement = (InputPort) view.getElement();
		LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/result = new LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/();
		result.addAll(getOutgoingFeatureModelFacetLinks_InputPort_Propagation_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getOutputPort_3002ContainedLinks(
			View view) {
		OutputPort modelElement = (OutputPort) view.getElement();
		LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/result = new LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/();
		result.addAll(getOutgoingFeatureModelFacetLinks_OutputPort_Connection_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OutputPort_Delegation_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getOutputPort_2001IncomingLinks(
			View view) {
		OutputPort modelElement = (OutputPort) view.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/result = new LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/();
		result.addAll(getIncomingFeatureModelFacetLinks_OutputPort_Delegation_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getHandler_2002IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getComponent_2003IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getInputPort_2004IncomingLinks(
			View view) {
		InputPort modelElement = (InputPort) view.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/result = new LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/();
		result.addAll(getIncomingFeatureModelFacetLinks_Handler_TrigeredBy_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OutputPort_Connection_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_InputPort_Propagation_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getProperty_2005IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getInputPort_3001IncomingLinks(
			View view) {
		InputPort modelElement = (InputPort) view.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/result = new LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/();
		result.addAll(getIncomingFeatureModelFacetLinks_Handler_TrigeredBy_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_OutputPort_Connection_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_InputPort_Propagation_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getOutputPort_3002IncomingLinks(
			View view) {
		OutputPort modelElement = (OutputPort) view.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/result = new LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/();
		result.addAll(getIncomingFeatureModelFacetLinks_OutputPort_Delegation_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getOutputPort_2001OutgoingLinks(
			View view) {
		OutputPort modelElement = (OutputPort) view.getElement();
		LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/result = new LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/();
		result.addAll(getOutgoingFeatureModelFacetLinks_OutputPort_Connection_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OutputPort_Delegation_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getHandler_2002OutgoingLinks(
			View view) {
		Handler modelElement = (Handler) view.getElement();
		LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/result = new LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/();
		result.addAll(getOutgoingFeatureModelFacetLinks_Handler_TrigeredBy_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getComponent_2003OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getInputPort_2004OutgoingLinks(
			View view) {
		InputPort modelElement = (InputPort) view.getElement();
		LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/result = new LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/();
		result.addAll(getOutgoingFeatureModelFacetLinks_InputPort_Propagation_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getProperty_2005OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getInputPort_3001OutgoingLinks(
			View view) {
		InputPort modelElement = (InputPort) view.getElement();
		LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/result = new LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/();
		result.addAll(getOutgoingFeatureModelFacetLinks_InputPort_Propagation_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getOutputPort_3002OutgoingLinks(
			View view) {
		OutputPort modelElement = (OutputPort) view.getElement();
		LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/result = new LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/();
		result.addAll(getOutgoingFeatureModelFacetLinks_OutputPort_Connection_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_OutputPort_Delegation_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getIncomingFeatureModelFacetLinks_Handler_TrigeredBy_4004(
			InputPort target,
			Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences) {
		LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/result = new LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/();
		Collection/*[org.eclipse.emf.ecore.EStructuralFeature.Setting]*/settings = (Collection) crossReferences
				.get(target);
		for (Iterator/*[org.eclipse.emf.ecore.EStructuralFeature.Setting]*/it = settings
				.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == RobmodPackage.eINSTANCE
					.getHandler_TrigeredBy()) {
				result.add(new RobmodLinkDescriptor(setting.getEObject(),
						target, RobmodElementTypes.HandlerTrigeredBy_4004,
						HandlerTrigeredByEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getIncomingFeatureModelFacetLinks_OutputPort_Connection_4005(
			InputPort target,
			Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences) {
		LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/result = new LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/();
		Collection/*[org.eclipse.emf.ecore.EStructuralFeature.Setting]*/settings = (Collection) crossReferences
				.get(target);
		for (Iterator/*[org.eclipse.emf.ecore.EStructuralFeature.Setting]*/it = settings
				.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == RobmodPackage.eINSTANCE
					.getOutputPort_Connection()) {
				result.add(new RobmodLinkDescriptor(setting.getEObject(),
						target, RobmodElementTypes.OutputPortConnection_4005,
						OutputPortConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getIncomingFeatureModelFacetLinks_OutputPort_Delegation_4006(
			OutputPort target,
			Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences) {
		LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/result = new LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/();
		Collection/*[org.eclipse.emf.ecore.EStructuralFeature.Setting]*/settings = (Collection) crossReferences
				.get(target);
		for (Iterator/*[org.eclipse.emf.ecore.EStructuralFeature.Setting]*/it = settings
				.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == RobmodPackage.eINSTANCE
					.getOutputPort_Delegation()) {
				result.add(new RobmodLinkDescriptor(setting.getEObject(),
						target, RobmodElementTypes.OutputPortDelegation_4006,
						OutputPortDelegationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getIncomingFeatureModelFacetLinks_InputPort_Propagation_4007(
			InputPort target,
			Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences) {
		LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/result = new LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/();
		Collection/*[org.eclipse.emf.ecore.EStructuralFeature.Setting]*/settings = (Collection) crossReferences
				.get(target);
		for (Iterator/*[org.eclipse.emf.ecore.EStructuralFeature.Setting]*/it = settings
				.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == RobmodPackage.eINSTANCE
					.getInputPort_Propagation()) {
				result.add(new RobmodLinkDescriptor(setting.getEObject(),
						target, RobmodElementTypes.InputPortPropagation_4007,
						InputPortPropagationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getOutgoingFeatureModelFacetLinks_Handler_TrigeredBy_4004(
			Handler source) {
		LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/result = new LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/();
		for (Iterator/*[?]*/destinations = source.getTrigeredBy().iterator(); destinations
				.hasNext();) {
			InputPort destination = (InputPort) destinations.next();
			result.add(new RobmodLinkDescriptor(source, destination,
					RobmodElementTypes.HandlerTrigeredBy_4004,
					HandlerTrigeredByEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getOutgoingFeatureModelFacetLinks_OutputPort_Connection_4005(
			OutputPort source) {
		LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/result = new LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/();
		for (Iterator/*[?]*/destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			InputPort destination = (InputPort) destinations.next();
			result.add(new RobmodLinkDescriptor(source, destination,
					RobmodElementTypes.OutputPortConnection_4005,
					OutputPortConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getOutgoingFeatureModelFacetLinks_OutputPort_Delegation_4006(
			OutputPort source) {
		LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/result = new LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/();
		for (Iterator/*[?]*/destinations = source.getDelegation().iterator(); destinations
				.hasNext();) {
			OutputPort destination = (OutputPort) destinations.next();
			result.add(new RobmodLinkDescriptor(source, destination,
					RobmodElementTypes.OutputPortDelegation_4006,
					OutputPortDelegationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/getOutgoingFeatureModelFacetLinks_InputPort_Propagation_4007(
			InputPort source) {
		LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/result = new LinkedList/*[robmod.robmod.diagram.part.RobmodLinkDescriptor]*/();
		for (Iterator/*[?]*/destinations = source.getPropagation().iterator(); destinations
				.hasNext();) {
			InputPort destination = (InputPort) destinations.next();
			result.add(new RobmodLinkDescriptor(source, destination,
					RobmodElementTypes.InputPortPropagation_4007,
					InputPortPropagationEditPart.VISUAL_ID));
		}
		return result;
	}

}
