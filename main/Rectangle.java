package ge.ufc.main;

public class Rectangle extends Figure{
	
	private double height;
	private double width;
	
//	Task2;
	
	//Task6 -> changing public to protected;
	@Override
	protected double countArea() {
		return this.height*this.width;
	}
	
	
	//Task6 -> changing public to protected;
	@Override
	protected double countPerimeter() {
		return 2*(this.height + this.width);
	}
	
	//	Task4
	public Rectangle() {
		super("Rectangle");
		this.height = 3;
		this.width = 4;
	}

	public Rectangle(double height, double width) {
		super("Rectangle with parameters");
		this.height = height;
		this.width = width;
	}

//	Task5;
	
	//Task6 -> changing public to protected;
	protected double countArea(double width, double height) {    
		return height*width;
	}
	
	//Task6 -> changing public to protected;
	protected double countPerimeter(double width, double height) {   
		return 2*(height+width);
	}
	
	
}
