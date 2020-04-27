/*
 * Class: CMSC201 
 * Instructor: Grinburg
 * Description: Calculate mean and standard deviation of a sample
 * Due: 2/16/2020
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Michael Amaya
*/

import java.util.Scanner;

public class Statistics {

	public static void main(String[] args) {
		// Formula for mean:
		// (x1 + x2 + x3 + xn......) / n
		// Formula for standard deviation:
		// sqrt(((x1 - mean)^2  + (x2 - mean)^2 + (x3 - mean)^2 + (xn - mean)^2......)/ (n - 1)) 
		
		//Declare constants
		final String HEADER = "**********";
		
		// Declare non constants
		double[] numbers = new double[10]; 
		Scanner input = new Scanner(System.in);
		double total = 0;
		double mean = 0;
		double standardDeviationPart1 = 0;
		double standardDeviation = 0;
		
		//Show header
		System.out.println(HEADER + "Find mean and standard deviation of sample" + HEADER);
		
		// Make a for loop to ask multiple times to input a number and record
		for(int i = 0; i < numbers.length; i++) {
			
			// Prompt user to put a number, put it in numbers[i]
			System.out.print("Enter a number: ");
			numbers[i] = input.nextDouble();
			
			// Add the current total with what was inputed
			total += numbers[i];
		}
		
		// Close input
		input.close();
		
		// Calculate mean by dividing the total by the length of numbers (10) 
		mean = total / numbers.length;
		
		// Calculate standard deviation part 1 ((xn - mean)^2) by looping through every item again
		// add old answer to the last
		for(double number: numbers) {
			standardDeviationPart1 += Math.pow((number - mean), 2);
		}
		
		// Calculate the standard deviation by dividing the first part by n - 1 where n is the length of numbers
		standardDeviation = Math.sqrt(standardDeviationPart1 / (numbers.length - 1));
		
		// Show user what the mean and standard deviation is
		System.out.println("The mean is " + mean); 
		System.out.println("The standard deviation is " + standardDeviation);
		
		// Show name:
		System.out.println(HEADER + "By Michael Amaya" + HEADER);
		
	}
}
