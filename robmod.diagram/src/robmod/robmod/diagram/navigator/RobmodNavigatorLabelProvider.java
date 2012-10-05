package robmod.robmod.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import robmod.robmod.Component;
import robmod.robmod.diagram.edit.parts.Component2EditPart;
import robmod.robmod.diagram.edit.parts.ComponentEditPart;
import robmod.robmod.diagram.edit.parts.ComponentNameEditPart;
import robmod.robmod.diagram.edit.parts.HandlerEditPart;
import robmod.robmod.diagram.edit.parts.HandlerNameEditPart;
import robmod.robmod.diagram.edit.parts.HandlerTrigeredByEditPart;
import robmod.robmod.diagram.edit.parts.InputPort2EditPart;
import robmod.robmod.diagram.edit.parts.InputPortDataType2EditPart;
import robmod.robmod.diagram.edit.parts.InputPortDataTypeEditPart;
import robmod.robmod.diagram.edit.parts.InputPortEditPart;
import robmod.robmod.diagram.edit.parts.InputPortNameEditPart;
import robmod.robmod.diagram.edit.parts.InputPortPropagationEditPart;
import robmod.robmod.diagram.edit.parts.OutputPort2EditPart;
import robmod.robmod.diagram.edit.parts.OutputPortConnectionEditPart;
import robmod.robmod.diagram.edit.parts.OutputPortDataType2EditPart;
import robmod.robmod.diagram.edit.parts.OutputPortDataTypeEditPart;
import robmod.robmod.diagram.edit.parts.OutputPortDelegationEditPart;
import robmod.robmod.diagram.edit.parts.OutputPortEditPart;
import robmod.robmod.diagram.edit.parts.OutputPortNameEditPart;
import robmod.robmod.diagram.edit.parts.PropertyEditPart;
import robmod.robmod.diagram.edit.parts.WrappingLabelEditPart;
import robmod.robmod.diagram.part.RobmodDiagramEditorPlugin;
import robmod.robmod.diagram.part.RobmodVisualIDRegistry;
import robmod.robmod.diagram.providers.RobmodElementTypes;
import robmod.robmod.diagram.providers.RobmodParserProvider;

/**
 * @generated
 */
public class RobmodNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		RobmodDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		RobmodDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof RobmodNavigatorItem
				&& !isOwnView(((RobmodNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof RobmodNavigatorGroup) {
			RobmodNavigatorGroup group = (RobmodNavigatorGroup) element;
			return RobmodDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof RobmodNavigatorItem) {
			RobmodNavigatorItem navigatorItem = (RobmodNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (RobmodVisualIDRegistry.getVisualID(view)) {
		case ComponentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://dupa.org/robmod.ecore?Component", RobmodElementTypes.Component_1000); //$NON-NLS-1$
		case OutputPort2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dupa.org/robmod.ecore?OutputPort", RobmodElementTypes.OutputPort_3002); //$NON-NLS-1$
		case OutputPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://dupa.org/robmod.ecore?OutputPort", RobmodElementTypes.OutputPort_2001); //$NON-NLS-1$
		case OutputPortConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://dupa.org/robmod.ecore?OutputPort?connection", RobmodElementTypes.OutputPortConnection_4005); //$NON-NLS-1$
		case InputPort2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://dupa.org/robmod.ecore?InputPort", RobmodElementTypes.InputPort_3001); //$NON-NLS-1$
		case HandlerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://dupa.org/robmod.ecore?Handler", RobmodElementTypes.Handler_2002); //$NON-NLS-1$
		case InputPortPropagationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://dupa.org/robmod.ecore?InputPort?propagation", RobmodElementTypes.InputPortPropagation_4007); //$NON-NLS-1$
		case PropertyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://dupa.org/robmod.ecore?Property", RobmodElementTypes.Property_2005); //$NON-NLS-1$
		case HandlerTrigeredByEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://dupa.org/robmod.ecore?Handler?trigeredBy", RobmodElementTypes.HandlerTrigeredBy_4004); //$NON-NLS-1$
		case InputPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://dupa.org/robmod.ecore?InputPort", RobmodElementTypes.InputPort_2004); //$NON-NLS-1$
		case Component2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://dupa.org/robmod.ecore?Component", RobmodElementTypes.Component_2003); //$NON-NLS-1$
		case OutputPortDelegationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://dupa.org/robmod.ecore?OutputPort?delegation", RobmodElementTypes.OutputPortDelegation_4006); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = RobmodDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& RobmodElementTypes.isKnownElementType(elementType)) {
			image = RobmodElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof RobmodNavigatorGroup) {
			RobmodNavigatorGroup group = (RobmodNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof RobmodNavigatorItem) {
			RobmodNavigatorItem navigatorItem = (RobmodNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (RobmodVisualIDRegistry.getVisualID(view)) {
		case ComponentEditPart.VISUAL_ID:
			return getComponent_1000Text(view);
		case OutputPort2EditPart.VISUAL_ID:
			return getOutputPort_3002Text(view);
		case OutputPortEditPart.VISUAL_ID:
			return getOutputPort_2001Text(view);
		case OutputPortConnectionEditPart.VISUAL_ID:
			return getOutputPortConnection_4005Text(view);
		case InputPort2EditPart.VISUAL_ID:
			return getInputPort_3001Text(view);
		case HandlerEditPart.VISUAL_ID:
			return getHandler_2002Text(view);
		case InputPortPropagationEditPart.VISUAL_ID:
			return getInputPortPropagation_4007Text(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_2005Text(view);
		case HandlerTrigeredByEditPart.VISUAL_ID:
			return getHandlerTrigeredBy_4004Text(view);
		case InputPortEditPart.VISUAL_ID:
			return getInputPort_2004Text(view);
		case Component2EditPart.VISUAL_ID:
			return getComponent_2003Text(view);
		case OutputPortDelegationEditPart.VISUAL_ID:
			return getOutputPortDelegation_4006Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getOutputPort_3002Text(View view) {
		IParser parser = RobmodParserProvider.getParser(
				RobmodElementTypes.OutputPort_3002,
				view.getElement() != null ? view.getElement() : view,
				RobmodVisualIDRegistry
						.getType(OutputPortNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RobmodDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHandler_2002Text(View view) {
		IParser parser = RobmodParserProvider.getParser(
				RobmodElementTypes.Handler_2002,
				view.getElement() != null ? view.getElement() : view,
				RobmodVisualIDRegistry.getType(HandlerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RobmodDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOutputPort_2001Text(View view) {
		IParser parser = RobmodParserProvider.getParser(
				RobmodElementTypes.OutputPort_2001,
				view.getElement() != null ? view.getElement() : view,
				RobmodVisualIDRegistry
						.getType(OutputPortDataTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RobmodDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInputPortPropagation_4007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOutputPortDelegation_4006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOutputPortConnection_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getInputPort_3001Text(View view) {
		IParser parser = RobmodParserProvider
				.getParser(RobmodElementTypes.InputPort_3001,
						view.getElement() != null ? view.getElement() : view,
						RobmodVisualIDRegistry
								.getType(InputPortNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RobmodDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProperty_2005Text(View view) {
		IParser parser = RobmodParserProvider
				.getParser(RobmodElementTypes.Property_2005,
						view.getElement() != null ? view.getElement() : view,
						RobmodVisualIDRegistry
								.getType(WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RobmodDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHandlerTrigeredBy_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getComponent_2003Text(View view) {
		IParser parser = RobmodParserProvider
				.getParser(RobmodElementTypes.Component_2003,
						view.getElement() != null ? view.getElement() : view,
						RobmodVisualIDRegistry
								.getType(ComponentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RobmodDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComponent_1000Text(View view) {
		Component domainModelElement = (Component) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RobmodDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInputPort_2004Text(View view) {
		IParser parser = RobmodParserProvider.getParser(
				RobmodElementTypes.InputPort_2004,
				view.getElement() != null ? view.getElement() : view,
				RobmodVisualIDRegistry
						.getType(InputPortDataTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RobmodDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ComponentEditPart.MODEL_ID.equals(RobmodVisualIDRegistry
				.getModelID(view));
	}

}
