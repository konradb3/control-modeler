package robmod.robmod.diagram.providers;

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
