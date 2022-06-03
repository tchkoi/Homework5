package ge.ufc.square;

import ge.ufc.main.Rectangle;

public final class Square extends Rectangle {
//	Task9 final class;
	private double squareSide;

//	Task7;
	@Override
	public double countArea(double width, double height) {
		return super.countArea(squareSide, squareSide);
	}

	@Override
	public double countPerimeter(double width, double height) {
		return super.countPerimeter(squareSide, squareSide);
	}
	
	
	
}
