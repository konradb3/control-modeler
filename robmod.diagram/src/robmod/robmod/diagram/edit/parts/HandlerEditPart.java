package robmod.robmod.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
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
import org.eclipse.swt.graphics.Color;

import robmod.robmod.diagram.edit.policies.HandlerItemSemanticEditPolicy;
import robmod.robmod.diagram.part.RobmodVisualIDRegistry;
import robmod.robmod.diagram.providers.RobmodElementTypes;

/**
 * @generated
 */
public class HandlerEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2002;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public HandlerEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new HandlerItemSemanticEditPolicy());
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
		return primaryShape = new HandlerFigure();
	}

	/**
	 * @generated
	 */
	public HandlerFigure getPrimaryShape() {
		return (HandlerFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof HandlerNameEditPart) {
			((HandlerNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureHandlerNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof HandlerNameEditPart) {
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
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
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
				.getType(HandlerNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/getMARelTypesOnSource() {
		ArrayList/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/types = new ArrayList/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/(
				2);
		types.add(RobmodElementTypes.HandlerTrigeredBy_4004);
		types.add(RobmodElementTypes.HandlerGenerates_4008);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/types = new LinkedList/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/();
		if (targetEditPart instanceof InputPortEditPart) {
			types.add(RobmodElementTypes.HandlerTrigeredBy_4004);
		}
		if (targetEditPart instanceof InputPort2EditPart) {
			types.add(RobmodElementTypes.HandlerTrigeredBy_4004);
		}
		if (targetEditPart instanceof OutputPortEditPart) {
			types.add(RobmodElementTypes.HandlerGenerates_4008);
		}
		if (targetEditPart instanceof OutputPort2EditPart) {
			types.add(RobmodElementTypes.HandlerGenerates_4008);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/getMATypesForTarget(
			IElementType relationshipType) {
		LinkedList/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/types = new LinkedList/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/();
		if (relationshipType == RobmodElementTypes.HandlerTrigeredBy_4004) {
			types.add(RobmodElementTypes.InputPort_2004);
			types.add(RobmodElementTypes.InputPort_3001);
		} else if (relationshipType == RobmodElementTypes.HandlerGenerates_4008) {
			types.add(RobmodElementTypes.OutputPort_2001);
			types.add(RobmodElementTypes.OutputPort_3002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class HandlerFigure extends Ellipse {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureHandlerNameFigure;

		/**
		 * @generated
		 */
		public HandlerFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(true);

			this.setLayoutManager(layoutThis);

			this.setLineWidth(2);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureHandlerNameFigure = new WrappingLabel();

			fFigureHandlerNameFigure.setText("<...>");

			this.add(fFigureHandlerNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHandlerNameFigure() {
			return fFigureHandlerNameFigure;
		}

	}

}
