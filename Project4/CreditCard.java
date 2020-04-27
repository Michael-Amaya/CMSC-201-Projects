/*
 * Class: CMSC201 
 * Instructor: Grinberg
 * Description: (Give a brief description for each Program)
 * Due: 02/23/2020
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Michael Amaya
*/

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		// Ask user to put a credit card number.
		System.out.println("**********Credit Card Validator*********");
		System.out.print("Enter a credit card number as a long integer: ");
		
		// Display the result using the user's input
		displayResult(inputData());
		
		// Display my name
		System.out.println("Programmer: Michael Amaya");
	}

	/** Return true if the card number is valid */
	 public static boolean isValid(long number) {
		// Check if the sizes are within the allowed limit of 13 <= x <= 16
		// If not, return false since a CC needs to be within that limit
		if(getSize(number) <= 16 && getSize(number) >= 13) {
			// Create array of prefixes to test for. 
			// 4, 5, 37, and 6 happen to be the prefixes for Visa, MC, Amex, and some other company
			int[] prefixes = {4,5,37,6};
			
			// Loop through this for every prefix
			for(int i : prefixes) {
				// Check if the prefixes match, it fails, it'll just go through the rest of the loop
				// and fail
				if(prefixMatched(number, i)) {
					// If it does match, get the sum of the sums of the evens place and odds place
					int sumOfEverything = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
					// Check if it's divisible by 10
					if(sumOfEverything % 10 == 0) {
						// If it is, return that it is valid
						// If not, it'll go through the rest of the loop and return false
						return true;
					}
				}
			}
			
			// Return false if it goes through the entire loop.
			return false;
		}
		
		// Return false if the size is not correct.
		return false;
	 }

	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number) {	
		// Reverse the number so you can read from right to left.
		String reversedNumber = (new StringBuilder(String.valueOf(number)).reverse()).toString();
		
		// Create new string array to hold half of the elements in reversedNumber,
		// Particularly, every other number starting with the evens place.
		String[] doubles = new String[reversedNumber.length()/2+1];
		
		// Declare sum to hold the sum of the even numbers * 2.
		int sum = 0;
		
		// For loop with i and k, k goes up 1 every iteration for the doubles array, and i goes up 2
		// to get the number in the evens place of the reversedNumber array.
		for(int i = 1, k = 0; i < reversedNumber.length();i+=2, k++) {
			// Fill every element of the doubles array every other item of the reversedNumber new array being created
			doubles[k] = reversedNumber.split("")[i];
		}
		
		// For each loops to get every String in doubles.
		for (String aNumber : doubles) {
			// Check to make sure that null isn't being passed through, causing errors
			if(aNumber != null)
				// Pass the result of getDigit to sum, passing the parsed integer of aNumber * 2. Will always
				// Get a 1 digit number. 
				sum += getDigit(Integer.parseInt(aNumber) * 2);
		}
		
		// Give the sum of every other even number.
		return sum;
	}
	  
	/** Return this number if it is a single digit, otherwise, 
	 * return the sum of the two digits */
	public static int getDigit(int number) { 
		// create String variable to hold the value of the number.
		// in order to get the length easily. 
		String parseNumber = String.valueOf(number);
		
		
		// If statement to check the length of the parsed number
		if(parseNumber.length() == 2) {
			// Create variable sum to hold the sum of the two numbers.
			int sum = 0;
			// Split the two numbers into two seperate elements in an array to add them easily
			String addNums[] = parseNumber.split("");
			// Go through the array and add the parsed Integer of aNumber to sum.
			// If the method received 18, it would split to 1, 8, then add and get result 9.
			for(String aNumber : addNums) {
				sum += Integer.parseInt(aNumber);
			}
			
			// Return the sum of the two numbers.
			return sum;
		} else {
			// If it only has 1 number, nothing needs to be done so return the number back
			return number;
		}
	}
	  
	/** Return sum of odd-place digits in number */
	public static int sumOfOddPlace(long number) {
		// Reverse the number in the same way as above
		String reversedNumber = (new StringBuilder(String.valueOf(number)).reverse()).toString();
		
		// Create a String array to hold the the numbers in the odds place.
		String[] doubles = new String[reversedNumber.length()/2+1];
		
		// Create variable sum to hold the sum of the numbers in the odds place
		int sum = 0;
		
		// For loop where i increases by 2, and k increases by 1. i starts at 0 for the odds place. The evens place 
		// would be 1, as above.
		for(int i = 0, k = 0; i < reversedNumber.length();i+=2, k++) {
			// Put the odds place number into the doubles array.
			doubles[k] = reversedNumber.split("")[i];
		}
		
		// Go through every number in the doubles array
		for (String aNumber : doubles) {
			// Make sure you're not adding null numbers
			if(aNumber != null)
				// No need to double anything here. Only single digits so you only need to add
				// The numbers into sum
				sum += Integer.parseInt(aNumber);
		}
		
		// Return the sum of the odds place. If anything failed, it should just come out with 0.
		return sum;
	}
	
	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		// Get the length of the prefix to check if it's an amex, visa, or MC, etc.
		int dLength = getSize((long) d);
		
		// Store the value of d in a string so we can use the String.equals method to check if the 
		// Prefixes match
		String parseD = String.valueOf(d);
		
		// Check if the length of d is 2
		if(dLength == 2) {
			// If it is, get the prefix and put that value into firsTwo
			String firstTwo = String.valueOf(getPrefix(number, 2));
			
			// Return true if the 2 numbers match d, false otherwise
			return firstTwo.equals(parseD);
			
		// Check if the length of d is 1
		} else if(dLength == 1){
			// Set the value of firstNumber to getPrefix
			String firstNumber = String.valueOf(getPrefix(number, 1));
			
			// Returns true if the number matches d, false otherwise
			return firstNumber.equals(parseD);
		}
		
		// There should never be a prefix with more then 2 characters
		// since it's preprogrammed, but in case that does manage to happen
		// Fail immediately.
		return false;
	}
	
	/** Return the number of digits in d */
	public static int getSize(long d) {
		// Just return the size of d. 
		return String.valueOf(d).length();
	}
	 
	/** Return the first k number of digits from number. If the
	 * number of digits in number is less than k, return number. */
	public static long getPrefix(long number, int k) {
		// Turn the value of number to a string to make use of the charAt method.
		String parseNumber = String.valueOf(number);
		
		// Check if the length is 2
		if (k == 2) {
			// Return the parsedLong after you concatonate the values at charAt(0) and charAt(1)
			// This means that if 34xxxxxx, it tries to add "3" + "4" which is 34.
			return Long.parseLong((String.valueOf(parseNumber.charAt(0)) + String.valueOf(parseNumber.charAt(1))));
		// Check if the length is 1
		} else if(k == 1) {
			// Just return the prefix number, which is the item at charAt(0)
			return Long.parseLong(String.valueOf(parseNumber.charAt(0)));
		}
		
		// Should never get to this point since a 0 or anything above is not possible. 
		return -1;
	}
	 
	/** input credit card’s number from keyboard
	Return this credit Card’s number
	*/
	public static long inputData() {
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		//Get the input from the user
		long data = input.nextLong();
		
		// Close the input as to not leak memory
		input.close();
		
		// Return what you got from the user
		return data;
	}
	 
	/**
	Display result using a method println()
	*/
	public static void displayResult(long number) {
		// Display what was given, using the isValid method.
		System.out.println(number + " is " + (isValid(number) ? "valid." : "invalid."));
	}


}
