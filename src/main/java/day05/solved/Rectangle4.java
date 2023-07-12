package day05.solved;

interface Polygon {

	public double area(double a, double b);
}

public class Rectangle4 implements Polygon {

	@Override
	public double area(double a, double b) {
		System.out.println("Calculating Rectangle area");
		return a*b;
	}

}

class RightAngledTriangle implements Polygon {

	@Override
	public double area(double a, double b) {
		System.out.println("Calculating RightAngledTriangle area");
		return (0.5 * a * b);
	}

}