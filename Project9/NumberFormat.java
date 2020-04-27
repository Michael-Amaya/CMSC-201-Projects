import java.util.Scanner;
/*
 * Class: CMSC201 
 * Instructor: Grinburg
 * Description: Convert a binary string to a decimal
 * Due: 04/12/2020
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Michael Amaya
*/
public class NumberFormat {

	public static void main(String[] args) {
		// Setup scanner for input
		Scanner input = new Scanner(System.in);
		
		// Hold the string that was gotten
		String binaryString;
		
		// Header
		System.out.println("**********Number Format**********");
		
		// Ask for binary string and record the answer
		System.out.print("Enter a binary string: ");
		binaryString = input.nextLine();
		
		// Close scanner
		input.close();
		
		// Get the decimal version by callig bin2Dec 
		int toDec = bin2Dec(binaryString);
		
		// Print the decimal
		System.out.println(toDec);
		
		// Footer
		System.out.println("**********By Michael Amaya**********");
	}
	
	public static int bin2Dec(String binaryString) {
		// Temp variable just to hold the decimal
		int temp = 0;
		
		try {
			// Try to parse the int, but if it's not a binary string, it'll throw numberformatexception and go to the catch block
			temp = Integer.parseInt(binaryString, 2);
		
		// Do this when an error occurs in try block
		} catch (NumberFormatException error) {
			// Tell user that what was entered wasn't a binary string
			System.out.printf("Error, %s was not a binary string\n", binaryString);
		}
		
		// Return the decimal of binaryString
		return temp;
	}

}
