package robmod.robmod.diagram.edit.parts;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;



public class ActivityBorderItemLocator extends BorderItemLocator {

/**
* Use to "middle overlap" the affixed child
*/
private static final int halfSizeOfAfffixedChild = 8;

public ActivityBorderItemLocator(IFigure parentFigure) {
super(parentFigure);
setBorderItemOffset(new Dimension(halfSizeOfAfffixedChild, halfSizeOfAfffixedChild));
}

public ActivityBorderItemLocator(IFigure mainFigure, int preferredSide) {
super(mainFigure, preferredSide);
setBorderItemOffset(new Dimension(halfSizeOfAfffixedChild, halfSizeOfAfffixedChild));
}

/*
 * (non-Javadoc)
 * 
 * @see org.eclipse.draw2d.Locator#relocate(org.eclipse.draw2d.IFigure)
 */
public void relocate(IFigure borderItem) {
    Dimension size = getSize(borderItem);

	Point ptNewLocation = locateOnBorder(getPreferredLocation(borderItem),
		getPreferredSideOfParent(), 0, borderItem);
    borderItem.setBounds(new Rectangle(ptNewLocation, size));
}

protected Point locateOnParent(Point suggestedLocation,
		int suggestedSide, IFigure borderItem) {
	Rectangle bounds = getParentBorder();
	int parentFigureWidth = bounds.width;
	int parentFigureHeight = bounds.height;
	int parentFigureX = bounds.x;
	int parentFigureY = bounds.y;
	Dimension borderItemSize = getSize(borderItem);
	int newX = suggestedLocation.x;
	int newY = suggestedLocation.y;
	int eastX = parentFigureX - getBorderItemOffset().width;
	int westX = parentFigureX + parentFigureWidth
		- borderItemSize.width
		+ getBorderItemOffset().width;
	int southY = parentFigureY + parentFigureHeight
		- getBorderItemOffset().height;
	int northY = parentFigureY - borderItemSize.height
		+ getBorderItemOffset().height;
	if (getPreferredSideOfParent() == PositionConstants.WEST) {
		if (suggestedLocation.x != westX) {
			newX = westX;
		}
		if (suggestedLocation.y < bounds.getTopLeft().y) {
			newY = northY + borderItemSize.height;
		} else if (suggestedLocation.y > bounds.getBottomLeft().y
			- borderItemSize.height) {
			newY = southY - borderItemSize.height;
		}
	} else if (getPreferredSideOfParent() == PositionConstants.EAST) {
		if (suggestedLocation.x != eastX) {
			newX = eastX;
		}
		if (suggestedLocation.y < bounds.getTopLeft().y) {
			newY = northY + borderItemSize.height;
		} else if (suggestedLocation.y > bounds.getBottomLeft().y
			- borderItemSize.height) {
			newY = southY - borderItemSize.height;
		}
	} else if (getPreferredSideOfParent() == PositionConstants.SOUTH) {
		if (suggestedLocation.y != southY) {
			newY = southY;
		}
		if (suggestedLocation.x < bounds.getBottomLeft().x) {
			newX = westX + borderItemSize.width;
		} else if (suggestedLocation.x > bounds.getBottomRight().x
			- borderItemSize.width) {
			newX = eastX - borderItemSize.width;
		}
	} else { // NORTH
		if (suggestedLocation.y != northY) {
			newY = northY;
		}
		if (suggestedLocation.x < bounds.getBottomLeft().x) {
			newX = westX + borderItemSize.width;
		} else if (suggestedLocation.x > bounds.getBottomRight().x
			- borderItemSize.width) {
			newX = eastX - borderItemSize.width;
		}
	}
	return new Point(newX, newY);
}

/**
* Get an initial location based on the side. ( choose first sixth part of the side for SOUTH or call super)
*
* @param side
* the preferred side of the parent figure on which to place this
* border item as defined in {@link PositionConstants}
* @return point
*/
/*
protected Point getPreferredLocation(int side, IFigure borderItem) {
if (side == PositionConstants.SOUTH) {
Rectangle bounds = getParentBorder();
int parentFigureWidth = bounds.width;
int parentFigureHeight = bounds.height;
int parentFigureX = bounds.x;
int parentFigureY = bounds.y;
int x = parentFigureX;
int y = parentFigureY;
x += parentFigureWidth / 2;
y = parentFigureY + parentFigureHeight - getBorderItemOffset().height;
return new Point(x, y);
} else {
return super.getPreferredLocation(side, borderItem);
}
} */
}