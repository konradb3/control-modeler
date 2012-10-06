package robmod.robmod.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import robmod.robmod.diagram.part.RobmodVisualIDRegistry;

/**
 * @generated
 */
public class RobmodNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof RobmodNavigatorItem) {
			RobmodNavigatorItem item = (RobmodNavigatorItem) element;
			return RobmodVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
