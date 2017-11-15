package io.hexlet.java.m101.xo.controller;

import io.hexlet.java.m101.xo.model.Field;
import io.hexlet.java.m101.xo.model.Point;

public class MoveController {

    private final static int MIN_COORDINATE = 0;
    private final static int MAX_COORDINATE = 3;

	public boolean applyFigure(final Field field,
                            final Point point,
                            final String figure) {
		// BEGIN (write your solution here)
		if (!checkCoordinate(point.x) ||  !checkCoordinate(point.y)) {
		    return false;
		}

		if (field.getFigure(point) != null) {
		    return false;
		}

		if (field.getFigure(point) == null) {
		    field.setFigure(point, figure);
		    return true;
		}
		// END
		return false;
	}
        // BEGIN (write your solution here) //You may want to check the coordinates in a separate method ???
    private static boolean checkCoordinate(final int coordinate) {
        if (coordinate < MIN_COORDINATE || coordinate > MAX_COORDINATE) {
            return false;
        }
        else return true;
    }
        // END
}
