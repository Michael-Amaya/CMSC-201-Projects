/*
 * Class: CMSC201 
 * Instructor: Grinburg
 * Description: Remove a string from a file, all specified in the arguments.
 * Due: 04/12/2020
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Michael Amaya
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RmvText {

	public static void main(String[] args) {
		
		// Variables to hold what to remove and the file name
		String toRemove;
		String fileName;
		
		// Scanner to read the text file
		Scanner fileReader;
		
		// Header
		System.out.println("**********RmvText**********");
		
		try {
			
			// Try to get the arguments passed, if it fails, it throws ArrayIndexOutOfBoundsException and goes to its catch block
			toRemove = args[0];
			fileName = args[1];
			
			// Set the Scanner to scan a file whos directory is in the same folder  as this program with the name in fileName
			// If the file is not found, go to the FileNotFoundException catch block
			fileReader = new Scanner(new File(System.getProperty("user.dir") + "\\" + fileName));
			
			// Check if there are any more lines in the file
			while(fileReader.hasNextLine()) {
				// Get the next line
				String temp = fileReader.nextLine();
				
				// Print the result of replacing the toRemove with nothing
				System.out.println(temp.replaceAll(toRemove, ""));
			}
				
		// Do this when ArrayIndexOutOfBoundsException is thrown
		} catch (ArrayIndexOutOfBoundsException error) {
			System.out.println("Not enough arguments passed");
		
		// Do this when FileNotFoundException is thrown
		} catch(FileNotFoundException error) {
			System.out.println("The file was not found!");
		}
		
		// Footer
		System.out.println("**********By Michael Amaya**********");
	}
	
}
