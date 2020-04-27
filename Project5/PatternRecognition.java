/*
 * Class: CMSC201 
 * Instructor: Grinberg
 * Description: Find consecutive fours in a list of numbers.
 * Due: 03/01/2020
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Michael Amaya
*/

import java.util.Scanner;

public class PatternRecognition {

	public static void main(String[] args) {
		// Create variables to store how many rows and columns
		int rows = 0;
		int columns = 0;
		
		// Create Scanner to get keyboard input
		Scanner input = new Scanner(System.in);
		
		// Prompt user to put number of rows and record
		System.out.print("Enter the number of rows: ");
		rows = input.nextInt();
		
		// Prompt user to enter columns and record
		System.out.print("Enter the number of columns: ");
		columns = input.nextInt();
		
		// Create new 2 dimensional array that has x amount of rows and x columns
		int[][] numbersToSearch = new int[rows][columns];
		
		// Ask user to put data.
		System.out.println("Enter the data for the search, \n" +
		"write " + rows + " rows of numbers with " + columns + " \n" +
		"columns of numbers. Separate every column with a space \n" + 
		"and every row with an enter sign. Once you have entered \n" +
		"every row, the program will check for consecutive fours");
		
		// Get input for the number of rows that the user put
		for (int i = 0; i < rows; i++)
			// For every row, get the input for the column
			for (int j = 0; j < columns; j++)
				numbersToSearch[i][j] = input.nextInt();
		// This allows for input to look like:
		// 0 1 0 3 1 6 1
		// 0 1 6 8 6 0 1
		// 5 6 2 1 8 2 9
		// 6 5 6 1 1 9 1
		// 1 3 6 1 4 0 7
		// 3 3 3 3 4 0 7
		// If they put 6 rows and 7 columns, where each line
		// is an array inside of a bigger array that holds every line.
		
		// Close the input to reserve memory
		input.close();
		
		// Get the answer so you can use in output once and calculate only once.
		boolean answer = isConsecutiveFour(numbersToSearch);
		
		// Show the user the answer
		System.out.println(answer + ": There " + (answer == true ? "are ":"arent ") + "consecutive fours.");
		
		//Print name
		System.out.println("Programmer: Michael Amaya");
		
	}
	
	public static boolean isConsecutiveFour(int[][] values) {
		// The length of values[0] will also be the length of all the other elements
		//in values[n] and it has to have some column or else the program will crash
		int columnLength = values[0].length;
		int rowLength = values.length;
		
		// Check for numbers vertically
		// Loop through columns
		for (int i = 0; i < columnLength; i++) {
			// Set the firstNumber as the first check variable, in this case values[0][i]
			// Every time it goes through this loop, reset to the first value.
			int firstNumber = values[0][i];
			
			// Counter to see if it finds 4 matching vertical numbers
			int foundNumber = 1;
			
			// Loop through every row
			for (int k = 1; k < rowLength; k++) {
				// Check if the number in the next row is the same
				// as the number that you start with
				if (firstNumber == values[k][i]) {
					// If it is, make the counter go up 1
					foundNumber++;
				} else {
				// If not:
					// Set the firstNumber to value and reset the counter
					// It sets to value[k][i] because when it loops through every row,
					// it'll go the next column and do the check again until it finds something
					
					firstNumber = values[k][i];
					foundNumber = 1;
				}
				
				// After going through every row, if the counter got to 4, or if it
				// found a vertical consecutive four, and will return true
				if (foundNumber == 4)
					return true;
			}
		}
		
		// If nothing matches vertically, then check horizontally.
		// Check Horizontally
		
		// Loop through the rows
		for (int i = 1; i < rowLength; i++) {
			// Set the starting value to the first value in each row
			int firstNumber = values[i][0];
			
			// Set counter to 1 since the first value is part of the consecutive four
			int foundNumber = 1;
			// Loop through the column
			for (int j = 1; j < columnLength; j++) {
				// If the current row, and next column is equal to the the current number
				// Then add 1 to the counter
				if (firstNumber == values[i][j]) {
					foundNumber++;
				} else {
					// If not Set the starting value to the current value in row i, column j
					// and reset the counter
					firstNumber = values[i][j];
					foundNumber = 1;
				}
				
				// If it found 4 consecutive numbers at the end of the column loop, return true.
				if (foundNumber == 4)
					return true;
			}
		}
		
		// If the vertical check failed and the horizontal check failed, check diagonally
		// Check diagonally
		// Diagonal checks are difficult, because you have to check in an X
		
		// From left to right
		// Loop through every row
		for (int i = 0; i < rowLength; i++) {
			// Starting value is the first value of the current row
			int firstNumber = values[i][0];
			
			// Set counter to 1
			int foundNumber = 1;
			// Loop through every column, making sure that the row index is not bigger
			// than the row current index j and the columnindex is not bigger than the current
			// column index k, the row index is 1 more than the current row as to check the 
			// next value, and k is 1 because you start at item 0 in the array and you want the
			// diagonal
			for (int j = i+1, k = 1; j < rowLength && k < columnLength; j++, k++) {
				// If you found a match in the right number down, then add 1 to the counter
				if (firstNumber == values[j][k]) {
					foundNumber++;
				} else {
				// If not, set the starting value to the current item and reset counter
					firstNumber = values[j][k];
					foundNumber = 1;
				}
				
				// If it finds a match from left to right, then return true.
				if (foundNumber == 4)
					return true;
			}
		}
		
		// As a second check, you loop through every column from left to right top to bottom
		for (int i = 0; i < columnLength; i++) {
			// Set a starting value
			int firstNumber = values[0][i];
			// Initiate a counter
			int foundNumber = 1;
			// Loop through every row, making sure that the columnlength and row length
			// are not being passed for an out of bounds error
			for (int j = i+1, k = 1; j < columnLength && k < rowLength; j++, k++) {
				// If you get a match, add 1 to the counter
				if (firstNumber == values[k][j]) {
					foundNumber++;
				} else {
				// If not, set the value of firstNumber to the check number
				// And reset the counter
					firstNumber = values[k][j];
					foundNumber = 1;
				}
				
				// If the the counter is 4, then return true
				if (foundNumber == 4)
					return true;
			}
		}
		
		// From right to left
		// Loop through every column
		for (int i = 0; i < columnLength; i++) {
			// Set a starting value
			int firstNumber = values[0][i];
			// Initiate a counter
			int foundNumber = 1;
			// Loop through every row, k goes down so it's right to left, making sure j is less than
			// the row length so you don't get an out of bounds error
			for (int j = 1, k = i-1; j < rowLength && k >= 0; j++, k--) {
				// If the number is equal to the starting value, add 1 to the counter
				if (firstNumber == values[j][k]) {
					foundNumber++;
				} else {
				// If not, set the starting value to the value and reset the counter
					firstNumber = values[j][k];
					foundNumber = 1;
				}
				
				// If the counter is 4, return true
				if (foundNumber == 4)
					return true;
			}
		}
		
		// Loop through every row
		for (int i = 0; i < rowLength; i++) {
			// Set a starting value
			int firstNumber = values[i][values[i].length-1];
			// Initiate a counter
			int foundNumber = 1;
			// Loop through every column, k is initiated to the length of the 
			// column - 2 because the starting point is the first value, then go down 1
			
			for (int j = i+1, k = columnLength-2; j < rowLength && k >= 0; j++, k--) {
				// If a match is found, add 1 to the counter
				if (firstNumber == values[j][k]) {
					foundNumber++;
				} else {
				// If not, set the starting value to the current value
				// and reset the counter
					firstNumber = values[j][k];
					foundNumber = 1;
				}
				
				// check if the counter is 4, and if it is, return true.
				if (foundNumber == 4) {
					return true;
				}
			}
		}
		
		// If all checks fail, return false!
		return false;
	}

}
