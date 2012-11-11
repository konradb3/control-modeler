package robmod.robmod.diagram.providers;

import robmod.robmod.Component;
import robmod.robmod.ComponentType;
import robmod.robmod.diagram.part.RobmodDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public void init_Component_2003(Component instance) {
		try {
			instance.setType2(ComponentType.COMPONENT_LITERAL);
		} catch (RuntimeException e) {
			RobmodDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Component_2006(Component instance) {
		try {
			instance.setType2(ComponentType.COMPOSITION_LITERAL);
		} catch (RuntimeException e) {
			RobmodDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = RobmodDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			RobmodDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
