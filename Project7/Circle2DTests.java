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

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Circle2DTests {
	private Circle2D testCircle1;
	private Circle2D testCircle2;
	
	/** Setup two circles to work with */
	@Before
	public void setUp() {
		testCircle1 = new Circle2D();
		testCircle2 = new Circle2D(0,0,5);
	}
	
	/** Test that the x, y, and radius are correct. The last argument .001 is precision */
	@Test
	public void testProperties() {
		// Test Circle 1
		assertEquals(0, testCircle1.getX(), .001);
		assertEquals(0, testCircle1.getY(), .001);
		assertEquals(1, testCircle1.getRadius(), .001);
		
		// Test Circle 2
		assertEquals(0, testCircle2.getX(), 1);
		assertEquals(0, testCircle2.getY(), 1);
		assertEquals(5, testCircle2.getRadius(), .001);
	}
	
	/** Test if the testcircles contain any test points or other circles */
	@Test
	public void testContains() {
		// Create temp Circle2D Objects to test with
		Circle2D circle1 = new Circle2D(1.5, 1.5, 1);
		Circle2D circle2 = new Circle2D(1, 3, 2);
		
		// Test Circle2D Objects
		assertFalse(testCircle1.contains(testCircle2));
		assertTrue(testCircle2.contains(testCircle1));
		assertFalse(testCircle1.contains(circle1));
		assertFalse(testCircle2.contains(circle2));
		
		// Test Points
		assertTrue(testCircle1.contains(0,0));
		assertFalse(testCircle1.contains(-2,0));
		assertTrue(testCircle2.contains(1,4));
		assertTrue(testCircle2.contains(-4,2));
	}
	
	/** Test if the test circles overlap any other circles */
	@Test
	public void testOverlap() {
		// Create temp Circle2D Objects to test with
		Circle2D circle1 = new Circle2D(1.5, 1.5, 2);
		Circle2D circle2 = new Circle2D(1, 3, 4);
		Circle2D circle3 = new Circle2D(10, 0, 5);
		Circle2D circle4 = new Circle2D(-9, 0, 5);
		
		assertTrue(testCircle1.overlaps(circle1));
		assertTrue(testCircle2.overlaps(circle2));
		assertFalse(testCircle2.overlaps(circle3));
		assertTrue(testCircle2.overlaps(circle4));
	}
	
	/** Tests the areas of the circle with a precision of .001 */
	@Test
	public void testArea() {
		assertEquals(78.54,testCircle2.getArea() , .001);
		assertEquals(Math.PI,testCircle1.getArea() , .001);
	}
	
	/** Tests the perimeter of the circles with a precision of .001 */
	@Test
	public void testPerimeter() {
		assertEquals(6.283, testCircle1.getPerimeter(), .001);
		assertEquals(31.416, testCircle2.getPerimeter(), .001);
	}
}
