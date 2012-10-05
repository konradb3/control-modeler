package robmod.robmod.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

import robmod.robmod.diagram.providers.RobmodElementTypes;

/**
 * @generated
 */
public class RobmodPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createRobmod1Group());
	}

	/**
	 * Creates "robmod" palette tool group
	 * @generated
	 */
	private PaletteContainer createRobmod1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Robmod1Group_title);
		paletteContainer.setId("createRobmod1Group"); //$NON-NLS-1$
		paletteContainer.add(createComponent1CreationTool());
		paletteContainer.add(createHandler2CreationTool());
		paletteContainer.add(createHandlerTrigeredBy3CreationTool());
		paletteContainer.add(createInputPort4CreationTool());
		paletteContainer.add(createOutputPort5CreationTool());
		paletteContainer.add(createOutputPortConnection6CreationTool());
		paletteContainer.add(createProperty7CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponent1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Component1CreationTool_title,
				Messages.Component1CreationTool_desc,
				Collections.singletonList(RobmodElementTypes.Component_2003));
		entry.setId("createComponent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RobmodElementTypes
				.getImageDescriptor(RobmodElementTypes.Component_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHandler2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Handler2CreationTool_title,
				Messages.Handler2CreationTool_desc,
				Collections.singletonList(RobmodElementTypes.Handler_2002));
		entry.setId("createHandler2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RobmodElementTypes
				.getImageDescriptor(RobmodElementTypes.Handler_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHandlerTrigeredBy3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.HandlerTrigeredBy3CreationTool_title,
				Messages.HandlerTrigeredBy3CreationTool_desc,
				Collections
						.singletonList(RobmodElementTypes.HandlerTrigeredBy_4004));
		entry.setId("createHandlerTrigeredBy3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RobmodElementTypes
				.getImageDescriptor(RobmodElementTypes.HandlerTrigeredBy_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInputPort4CreationTool() {
		ArrayList/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/types = new ArrayList/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/(
				2);
		types.add(RobmodElementTypes.InputPort_3001);
		types.add(RobmodElementTypes.InputPort_2004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InputPort4CreationTool_title,
				Messages.InputPort4CreationTool_desc, types);
		entry.setId("createInputPort4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RobmodElementTypes
				.getImageDescriptor(RobmodElementTypes.InputPort_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutputPort5CreationTool() {
		ArrayList/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/types = new ArrayList/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/(
				2);
		types.add(RobmodElementTypes.OutputPort_2001);
		types.add(RobmodElementTypes.OutputPort_3002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.OutputPort5CreationTool_title,
				Messages.OutputPort5CreationTool_desc, types);
		entry.setId("createOutputPort5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RobmodElementTypes
				.getImageDescriptor(RobmodElementTypes.OutputPort_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutputPortConnection6CreationTool() {
		ArrayList/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/types = new ArrayList/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/(
				3);
		types.add(RobmodElementTypes.OutputPortConnection_4005);
		types.add(RobmodElementTypes.OutputPortDelegation_4006);
		types.add(RobmodElementTypes.InputPortPropagation_4007);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.OutputPortConnection6CreationTool_title,
				Messages.OutputPortConnection6CreationTool_desc, types);
		entry.setId("createOutputPortConnection6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RobmodElementTypes
				.getImageDescriptor(RobmodElementTypes.OutputPortConnection_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProperty7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Property7CreationTool_title,
				Messages.Property7CreationTool_desc,
				Collections.singletonList(RobmodElementTypes.Property_2005));
		entry.setId("createProperty7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RobmodElementTypes
				.getImageDescriptor(RobmodElementTypes.Property_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(
				String title,
				String description,
				List/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(
				String title,
				String description,
				List/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
