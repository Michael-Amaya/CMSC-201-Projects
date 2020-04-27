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

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// Scanner object to get user input
		Scanner input = new Scanner(System.in);
		
		// Variables to hold triangle information, and user choice for filled or not
		double side1;
		double side2;
		double side3;
		String color;
		boolean filled = false;
		String choice;
		Triangle triangle;
		
		// Header
		System.out.println("**********Triangle Assignment**********");
		
		// Ask user for side 1 and record it into side1
		System.out.print("Enter side 1 of the triangle: ");
		side1 = Double.parseDouble(input.nextLine());
		
		// ASk user for side2 and record it into side2
		System.out.print("Enter side 2 of the triangle: ");
		side2 = Double.parseDouble(input.nextLine());
		
		// Ask user for side3 and record it into side3
		System.out.print("Enter side 3 of the triangle: ");
		side3 = Double.parseDouble(input.nextLine());
		
		// Ask user for the color of triangle and record it into color
		System.out.print("Enter color of triangle: ");
		color = input.nextLine();
		
		// Ask user if the triangle is filled or not, and record it into choice
		System.out.print("Enter whether triangle is filled (yes/no): ");
		choice = input.nextLine();
		
		// Close scanner to preserve memory
		input.close();
		
		// Check the choice for if the triangle is filled
		switch (choice){
			// 3 checks for yes, and if the user did put yes, it'll set filled to true
			case "yes":
			case "y":
			case "YES":
				filled = true;
				break;
			
			// 3 checks for no, and if the user put no, it'll set filled to false
			case "no":
			case "n":
			case "NO":
				filled = false;
				break;
		}
		
		// Create new triangle object with the sides that the user defined
		triangle = new Triangle(side1, side2, side3);
		
		// Set if the triangle is filled or not, depending on what the user put
		// Also set the triangle color depending on what the user put
		triangle.setFilled(filled);
		triangle.setColor(color);
		
		// Show the area, perimeter, color, and if the triangle is filled to the user
		System.out.printf("Area: %.2f\n"
						+ "Perimeter: %.2f\n"
						+ "Color: %s\n"
						+ "Filled: %s\n",
						triangle.getArea(), triangle.getPerimeter(),
						triangle.getColor(), triangle.isFilled() ? "true" : "false");
		
		// Footer
		System.out.println("********By Michael Amaya**********");
	}

}
