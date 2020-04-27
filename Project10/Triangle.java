/*
 * Class: CMSC201 
 * Instructor: Grinberg
 * Description: Create a triangle and get data from it using an abstract class
 * Due: 04/19/2020
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Michael Amaya
*/
/** Triangle object extends GeometricObject and calculates the area and perimeter of a triangle
 * 
 * @author Michael Amaya
 *
 */
public class Triangle extends GeometricObject{
	private double side1;	// The first side of the triangle
	private double side2;	// The second side of the triangle
	private double side3;	// The third side of the triangle

	/** Blank constructor to set all sides to 1*/
	public Triangle() {
		side1 = side2 = side3 = 1.0;
	}
	
	/** Constructor that sets all sides of the triangle to what the user passed */
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	/** Gets the first side length
	 * 
	 * @return The value of side1
	 */
	public double getSide1() {
		return side1;
	}

	/** Sets the length of the first side
	 * 
	 * @param side1 What to set the first side to
	 */
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	
	/** Gets the second side length
	 * 
	 * @return The value of side2
	 */
	public double getSide2() {
		return side2;
	}

	/** Sets the length of the second side
	 * 
	 * @param side2 What to set the second side to
	 */
	public void setSide2(double side2) {
		this.side2 = side2;
	}

	/** Gets the third side length
	 * 
	 * @return The value of side3
	 */
	public double getSide3() {
		return side3;
	}

	/** Sets the length of the third side
	 * 
	 * @param side3 What to set the third side to
	 */
	public void setSide3(double side3) {
		this.side3 = side3;
	}

	/** Gets the triangle's area
	 * 
	 *  @return The area of the triangle
	 * 
	 */
	@Override
	public double getArea() {
		// Use Heron's formula to calculate the area
		// Formula: sqrt(s(s - a)(s - b)(s - c))
		// Where s is (a + b + c)/2 
		// and a is side1, b is side2, and c is side3
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}

	/** Gets the triangle's perimeter
	 * 
	 *  @return The perimeter of the triangle
	 * 
	 */
	@Override
	public double getPerimeter() {
		// Formula for the perimeter of a triangle is a + b + c
		// Where a is side1, b is side2, and c is side3
		return side1 + side2 + side3;
	}

}
