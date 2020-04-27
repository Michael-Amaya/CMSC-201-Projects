/*
 * Class: CMSC201 
 * Instructor: Grinburg
 * Description: Get two integers and give their sum, if they don't enter an integer, keep asking until two are given
 * Due: 04/12/2020
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Michael Amaya
*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {

	public static void main(String[] args) {
		// Create scanner to get input
		Scanner input = new Scanner(System.in);
		
		// Create variables to get the sum and to get how many ints fount
		int sum = 0;
		int intsFound = 0;
		
		System.out.println("**********InputMismatch**********");
		// Do this until 2 ints are found
		do {
			try {
				// Ask user for an integer
				System.out.print("Enter an integer: ");
				
				// Try to get the int, if it's not an int, go to the catch block
				int temp = input.nextInt();
				
				// Add the int to the sum
				sum += temp;
				
				// Add 1 to ints found so that when two ints are found, it'll stop asking
				intsFound++;
			
			// If it gets an input error, do this
			} catch (InputMismatchException error) {
				// Ask user to only put in ints
				System.out.println("Please enter an integer");
				
				// Reset the scanner by going to the next line.
				input.nextLine();
			}
		} while(intsFound < 2);
		
		// Close scanner
		input.close();
		
		// Print the sum
		System.out.println("Sum: " + sum);
		
		// footer
		
		System.out.println("**********By Michael Amaya**********");
	}

}
