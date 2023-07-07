package day01.practice;

public class Cat {

	// Attributes
    private int age;
    private String color;

    // Constructor
    public Cat(int age, String color) {
        this.age = age;
        this.color = color;
    }

    // Getters and setters
    public int hasDots() {
        return age;
    }

    public void setHasDots(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

	public String speak() {
    return "Meow!";
    }
	
	  private static void validateAge(int age) {
	        if (age <0) {
	        	
	            throw new IllegalArgumentException("Cat age is minimum value requried :");
	        }
	    }

    // Main method to create Cat objects
    public static void main(String[] args) {
        // Create two Dog objects
        Cat cat1 = new Cat(4, "White");
        Cat cat2 = new Cat(3, "Black");

        // Print the attributes of each Cat
        System.out.println("Cat 1:");
        System.out.println("Age: " + cat1.hasDots());
        System.out.println("Color: " + cat1.getColor());
		System.out.println("Speaks: " + cat1.speak());

        System.out.println("Cat 2:");
        System.out.println("Has Dots: " + cat2.hasDots());
        System.out.println("Color: " + cat2.getColor());
		System.out.println("Speaks: " + cat2.speak());
    }
}
