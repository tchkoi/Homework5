package ge.ufc.main;

import ge.ufc.square.Square;

public class Main {
	
	public static void main(String[] args) {
		
//		Task2;
		Figure figure = new Figure("Figure");
		figure.countArea();
		figure.countPerimeter();
		
//		Task5;
		Rectangle rectangle = new Rectangle(15, 10);
		rectangle.countArea();
		rectangle.countArea(15, 10);
		rectangle.countPerimeter();
		rectangle.countPerimeter(15,10);

//		Task3
		System.out.println(rectangle instanceof Rectangle);
		System.out.println(figure instanceof Figure);
		System.out.println(rectangle instanceof Figure);
		System.out.println(figure instanceof Rectangle);
		
		Square square = new Square();
		square.countArea(17, 17);
		square.countPerimeter(17, 17);
	
	}
	
}
