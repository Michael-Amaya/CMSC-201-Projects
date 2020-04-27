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

/** This circle class makes circles and does a couple of tests and calculates properties
 * The first test is to see if the circle is inside of another circle
 * The second test is to see if the circle overlaps
 * The first property of a circle that is calculated is the area
 * The second property of a circle that is calculated is the perimeter or the circumference
 * 
 * @author Michael Amaya
 *
 */
public class Circle2D {
	private double x, y;	// Global variables
	private double radius;	// for the circles
	
	/** Blank constructor for creating a default circle with a center of (0,0), radius 1 */
	public Circle2D() {
		this(0,0,1);
	}
	
	/** This constructor gives the properties of the circle that the user assigned 
	 * 
	 * @param x The x value of the center of the circle
	 * @param y The y value of the center of the circle
	 * @param radius the radius of the circle
	 */
	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	/** Gets the X value of the center of the circle
	 * 
	 * @return The value of x
	 */
	public double getX() {
		return x;
	}
	
	/** Gets the Y value of the center of the circle
	 * 
	 * @return the value of Y
	 */
	public double getY() {
		return y;
	}
	
	/** Gets the radius of the circle
	 * 
	 * @return the value of radius
	 */
	public double getRadius() {
		return radius;
	}
	
	/** Calculates the area with pi * r^2
	 * 
	 * @return The area of the circle 
	 */
	public double getArea() {
		return (Math.PI * (radius * radius));
	}
	
	/** Calculates the perimeter or circumference with 2 * pi * r
	 * 
	 * @return The perimeter of the circle
	 */
	public double getPerimeter() {
		return (2 * Math.PI * radius);
	}
	
	/** Checks if the circle contains the coordinates (x,y)
	 * 
	 * @param x The x value of the point
	 * @param y The y value of the point
	 * @return True of False depending if the point is in the circle or not
	 */
	public boolean contains(double x, double y) {
		// Distance formula:
		// d = sqrt((xpoint1 - xpoint2)^2 + (ypoint1 - ypoint2)^2)
		double distance = Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
		
		// Check if the point is in circle with the distance
		if(distance < radius) {
			return true;
		}
		
		return false;
	}
	
	/** Checks if a circle is within another circle using another Circle2D object
	 * 
	 * @param circle Another instance of Circle2D with an x, y, and radius already
	 * @return True of False depending if the other circle is within this circle
	 */
	public boolean contains(Circle2D circle) {
		// Use distance formula to get the distance between the two circles
		 double distance = Math.sqrt(Math.pow((x - circle.getX()),2) + Math.pow((y - circle.getY()), 2));
		 
		 // Check if the distance + circle's radius is less than the radius, therefore
		 // making it within the circle
		 if(distance + circle.getRadius() < radius)
			 return true;
		 
		return false;
	}
	/** Check if a circle overlaps another circle using another Circle2D object
	 * 
	 * @param circle Another instance of Circle2D with an x, y, and radius already
	 * @return True of False depending if the circle overlaps another circle
	 */
	public boolean overlaps(Circle2D circle) {
		// Use distance formula to get the distance
		double distance = Math.sqrt(Math.pow((x - circle.getX()),2) + Math.pow((y - circle.getY()), 2));
		
		// Calculate the sum of the radii for use in calculation
		double sumOfRadii = radius + circle.getRadius();
		
		// Check if the distance is less than the sum of the radii, this will mean
		// that the circle's are overlapping. If it's equal, then they would be touching
		if(distance < sumOfRadii)
			return true;
		
		return false;
	}
}
