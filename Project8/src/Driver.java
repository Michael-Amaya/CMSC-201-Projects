/*
 * Class: CMSC201 
 * Instructor: Grinberg
 * Description: Use class inheritance to create subclasses of other classes.
 * Due: 04/05/2020
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Michael Amaya
*/

import java.util.Scanner;

/** The driver program asks the end user questions about people at a school
 *  It then displays the data given at the end of the program.
 * 
 * @author Michael Amaya
 *
 */
public class Driver {

	public static void main(String[] args) {
		// Setup scanner to get input from a keyboard
		Scanner input = new Scanner(System.in);
		
		// Create variable for choice
		int choice;
		
		// Create variables for the data that the Student, Faculty, and Staff classes need
		String name;
		String address;
		String emailAddress;
		String phoneNumber;
		int officeNumber;
		int salary;
		MyDate dateHired;
		String officeHours;
		String rank;
		String title;
		String status;
		
		
		//  Print Header
		System.out.println("**********Class Inheritance Project 8**********");
		
		// Give options
		System.out.println("1) To create a Student");
		System.out.println("2) To create an Employee");
		
		// Get the choice
		System.out.print("Choice: ");
		choice = Integer.parseInt(input.nextLine());
		
		// Go through the choice
		switch(choice) {
			case 1: {
				// Get required data for student
				// Name
				System.out.print("Enter student's name: ");
				name = input.nextLine();
				
				// Address
				System.out.printf("Enter %s's Address: ", name);
				address = input.nextLine();
				
				// Phone number
				System.out.printf("Enter %s's Phone Number: ", name);
				phoneNumber = input.nextLine();
				
				// Email Address
				System.out.printf("Enter %s's Email Address: ", name);
				emailAddress = input.nextLine();
				
				// Class status
				System.out.printf("Enter %s's class Status: ", name);
				status = input.nextLine();
				
				// Create new student object with everything that was recieved
				Student student = new Student(name, address, phoneNumber, emailAddress, status);
				
				// Show the student info
				System.out.println(student.toString());
				break;
			}
			
			case 2: {
				// Get the employee's information
				// Name
				System.out.print("Enter Employee's name: ");
				name = input.nextLine();
				
				// Address
				System.out.printf("Enter %s's Address: ", name);
				address = input.nextLine();
				
				// Phone number
				System.out.printf("Enter %s's Phone Number: ", name);
				phoneNumber = input.nextLine();
				
				// Email address
				System.out.printf("Enter %s's Email Address: ", name);
				emailAddress = input.nextLine();
				
				// Ask if the employee will be a staff or faculty member
				System.out.println("1) To create a Faculty member");
				System.out.println("2) To create a Staff member");
				
				// Get the choice
				System.out.print("Choice: ");
				choice = Integer.parseInt(input.nextLine());
				
				// Check what option the user selected
				switch(choice) {
					case 1: {
						// Get information about the faculty member
						
						// Office Number
						System.out.print("Enter Office Number: ");
						officeNumber = Integer.parseInt(input.nextLine());
						
						// Salary
						System.out.print("Enter Salary: ");
						salary = Integer.parseInt(input.nextLine());
						
						// Date Hired
						System.out.print("Enter Hire Date: ");
						dateHired = new MyDate(input.nextLine());
						
						// Office Hours
						System.out.print("Enter Office Hours: ");
						officeHours = input.nextLine();
						
						// Faculty Rank
						System.out.print("Enter a rank: ");
						rank = input.nextLine();
						
						// Create faculty object with information received
						Faculty faculty = new Faculty(name, address, phoneNumber, emailAddress, officeNumber, salary, dateHired, officeHours, rank);
						
						// Print data in faculty object
						System.out.println(faculty.toString());
						break;
					}
					
					case 2: {
						// Get information about Staff
						// Get office Number
						System.out.print("Enter Office Number: ");
						officeNumber = Integer.parseInt(input.nextLine());
						
						// Salary
						System.out.print("Enter Salary: ");
						salary = Integer.parseInt(input.nextLine());
						
						// Date Hired
						System.out.print("Enter Hire Date: ");
						dateHired = new MyDate(input.nextLine());
						
						// title
						System.out.print("Enter Title: ");
						title = input.nextLine();
						
						// Create Staff object with data received
						Staff staff = new Staff(name, address, phoneNumber, emailAddress, officeNumber, salary, dateHired, title);
						
						// Print the staff object information
						System.out.println(staff.toString());
						break;
					}
					
					default: {
						// Didn't select 1 or 2
						System.out.println("Wrong option selected, restart program and try again");
						break;
					}
				}
				
				break;
			}
			
			default: {
				// Didn't select 1 or 2
				System.out.println("Wrong selected, restart program and try again");
				break;
			}
		}
		
		// Close scanner to preserve memory
		input.close();
		
		// Footer of program
		System.out.println("**********By Michael Amaya**********");
	}
}
