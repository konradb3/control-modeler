package robmod.robmod.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.draw2d.CenterLayout;
import org.eclipse.swt.graphics.Color;

import robmod.robmod.RobmodPackage;
import robmod.robmod.diagram.edit.policies.OutputPort2ItemSemanticEditPolicy;
import robmod.robmod.diagram.part.RobmodVisualIDRegistry;
import robmod.robmod.diagram.providers.RobmodElementTypes;

/**
 * @generated
 */
public class OutputPort2EditPart extends AbstractBorderItemEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3002;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated NOT
	 */

	private BorderLayout bLayout;

	/**
	 * @generated
	 */
	public OutputPort2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				getPrimaryDragEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new OutputPort2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child,
					EditPart after) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new OutputPortFigure();
	}

	/**
	 * @generated
	 */
	public OutputPortFigure getPrimaryShape() {
		return (OutputPortFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof OutputPortNameEditPart) {
			((OutputPortNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureOutputPortNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof OutputPortNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated NOT
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(10, 10);

		//FIXME: workaround for #154536
		result.getBounds().setSize(result.getPreferredSize());
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * @generated NOT
	 */
	protected void handleNotificationEvent(Notification notification) {
		Object feature = notification.getFeature();
		if (RobmodPackage.eINSTANCE.getPort_External().equals(feature)) {
			if (notification.getNewBooleanValue()) {
				primaryShape.setVisible(false);
			} else {
				primaryShape.setVisible(true);
			}
		} else
			super.handleNotificationEvent(notification);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart arg0) {
		FixedConnectionAnchor fixedAnchor = new FixedConnectionAnchor(
				getFigure(), 1d, 0.5d);
		return fixedAnchor;
	}

	/**
	 * @generated NOT
	 */
	@Override
	public ConnectionAnchor getSourceConnectionAnchor(Request request) {

		FixedConnectionAnchor fixedAnchor = new FixedConnectionAnchor(
				getFigure(), 1d, 0.5d);

		return fixedAnchor;

	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(RobmodVisualIDRegistry
				.getType(OutputPortNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/getMARelTypesOnSource() {
		ArrayList/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/types = new ArrayList/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/(
				2);
		types.add(RobmodElementTypes.OutputPortConnection_4005);
		types.add(RobmodElementTypes.OutputPortDelegation_4006);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/types = new LinkedList/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/();
		if (targetEditPart instanceof InputPortEditPart) {
			types.add(RobmodElementTypes.OutputPortConnection_4005);
		}
		if (targetEditPart instanceof InputPort2EditPart) {
			types.add(RobmodElementTypes.OutputPortConnection_4005);
		}
		if (targetEditPart instanceof OutputPortEditPart) {
			types.add(RobmodElementTypes.OutputPortDelegation_4006);
		}
		if (targetEditPart instanceof robmod.robmod.diagram.edit.parts.OutputPort2EditPart) {
			types.add(RobmodElementTypes.OutputPortDelegation_4006);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/getMATypesForTarget(
			IElementType relationshipType) {
		LinkedList/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/types = new LinkedList/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/();
		if (relationshipType == RobmodElementTypes.OutputPortConnection_4005) {
			types.add(RobmodElementTypes.InputPort_2004);
			types.add(RobmodElementTypes.InputPort_3001);
		} else if (relationshipType == RobmodElementTypes.OutputPortDelegation_4006) {
			types.add(RobmodElementTypes.OutputPort_2001);
			types.add(RobmodElementTypes.OutputPort_3002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/getMARelTypesOnTarget() {
		ArrayList/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/types = new ArrayList/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/(
				1);
		types.add(RobmodElementTypes.OutputPortDelegation_4006);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/getMATypesForSource(
			IElementType relationshipType) {
		LinkedList/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/types = new LinkedList/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/();
		if (relationshipType == RobmodElementTypes.OutputPortDelegation_4006) {
			types.add(RobmodElementTypes.OutputPort_2001);
			types.add(RobmodElementTypes.OutputPort_3002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class OutputPortFigure extends RoundedRectangle {

		/**
		 * @generated NOT
		 */
		private Label fFigureOutputPortNameFigure;
		private RoundedRectangle rect;
		private BorderLayout layoutThis;

		/**
		 * @generated NOT
		 */
		public OutputPortFigure() {

			layoutThis = new BorderLayout();

			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(4),
					getMapMode().DPtoLP(4)));
			this.setLineWidth(0);
			//this.setPreferredSize(new Dimension(getMapMode().DPtoLP(200),
			//		getMapMode().DPtoLP(40)));

			createContents();

			layoutThis.setConstraint(rect, BorderLayout.CENTER);
			layoutThis.setConstraint(fFigureOutputPortNameFigure,
					BorderLayout.LEFT);
			layoutThis.setHorizontalSpacing(6);
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			fFigureOutputPortNameFigure = new Label();

			fFigureOutputPortNameFigure.setText("<...>");

			this.add(fFigureOutputPortNameFigure);

			rect = new RoundedRectangle();
			rect.setSize(20, 20);
			rect.setFill(true);
			rect.setLineWidth(2);
			rect.setForegroundColor(ColorConstants.black);
			rect.setBackgroundColor(ColorConstants.black);
			this.add(rect);
		}

		/**
		 * @generated NOT
		 */
		public Label getFigureOutputPortNameFigure() {
			return fFigureOutputPortNameFigure;
		}

	}

}
