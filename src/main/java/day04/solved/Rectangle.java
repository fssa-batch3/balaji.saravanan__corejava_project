package day04.solved;

public class Rectangle extends Polygon {
	
	protected double length;
	protected double breadth;
	
	public Rectangle(double length, double breadth) throws Exception {
		super(4);
		if(length <= 0 || breadth <= 0) {
			throw new Exception("Invalid dimensions for a rectangle");
		}
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double calculateArea() {
		
		return this.length * this.breadth;
	}

	public double circumference() {
		
		return 2*(this.length + this.breadth);
		
	}
	
	public int getNumberOfSides() {
		return super.numberOfSides;
	}

}

class Square extends Rectangle {
	
	public Square(double side_length) throws Exception {
		super(side_length, side_length);
	}

}