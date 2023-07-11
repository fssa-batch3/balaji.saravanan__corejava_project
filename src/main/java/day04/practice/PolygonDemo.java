package day04.practice;

public class PolygonDemo {
	public static void main(String[] args) {

		try {
			Polygon1 rec = new Rectangle2(10.1, 33.2);
			Polygon1 rat = new RightAngledTriangle(20, 30, 45);
			System.out.println(rec.calculateArea());
			System.out.println(rec.circumference());
			System.out.println(rat.calculateArea());
			System.out.println(rat.circumference());
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
