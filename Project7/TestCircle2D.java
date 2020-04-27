/*
 * Class: CMSC201 
 * Instructor: Grinberg
 * Description: Create Circle2D class with multiple methods to test circles.
 * Due: 03/29/2020
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Michael Amaya
*/

public class TestCircle2D {

	public static void main(String[] args) {
		// Main circle that all others will compare to
		Circle2D circle1 = new Circle2D(0,0,5);
		
		// First circle that is definitely inside of the first circle.
		Circle2D circle2 = new Circle2D(1,3,1);
		
		// Second circle that is overlapping
		Circle2D circle3 = new Circle2D(9,0,5);
		
		// Third circle that is touching, not overlapping
		Circle2D circle4 = new Circle2D(10,0,5);
		
		// Some tests, other tests (JUnit Tests) in Circle2DTest.java.
		System.out.println("The following should say \"true\" because the circle is within another circle: " + circle1.contains(circle2));
		System.out.println("The following should say \"true\" because the circle is overlapping the second circle: " + circle1.overlaps(circle3));
		System.out.println("The following should say \"false\" because the circle is touching the second circle, not overlapping: " + circle1.overlaps(circle4));
		System.out.println("The following should say \"true\" because the point is in the circle: " + circle1.contains(1,4));
		
		// Showing the areas of all circles
		System.out.println("Area of circle1: " + circle1.getArea());
		System.out.println("Area of circle2: " + circle2.getArea());
		System.out.println("Area of circle3: " + circle3.getArea());
		System.out.println("Area of circle4: " + circle4.getArea());
		
		// Showing perimeter of all circles:
		System.out.println("Perimeter of circle1: " + circle1.getPerimeter());
		System.out.println("Perimeter of circle2: " + circle2.getPerimeter());
		System.out.println("Perimeter of circle3: " + circle3.getPerimeter());
		System.out.println("Perimeter of circle4: " + circle4.getPerimeter());
		
		// Required Tests
		Circle2D c1 = new Circle2D(1,2,5.5);
		System.out.println("The required circle test with center (1,2) and radius 5.5: ");
		System.out.printf(
				"The area: %.2f\n" +
				"The perimeter: %.2f\n" +
				"Result if point (3,3) is in circle: %s\n" +
				"Result if circle with center (4,5) and radius 10.5 is inside of main circle: %s\n" +
				"Result if circle overlaps circle with center (3,5) and radius 2.3: %s\n",
				c1.getArea(), c1.getPerimeter(), c1.contains(3,3) ? "true": "false",
				c1.contains(new Circle2D(4,5,10.5)) ? "true":"false", c1.overlaps(new Circle2D(3,5,2.3)) ? "true":"false");
		
	}
}

