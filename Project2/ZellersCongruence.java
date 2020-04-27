import java.util.Scanner;

/*
 * Class: CMSC201 
 * Instructor: Grinberg
 * Description: Calculate day of the week based on the month, day, year, compiled with javac and eclipse.
 * Due: 02/09/2020
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Michael Amaya
*/

public class ZellersCongruence {

	public static void main(String[] args) {
		
		// Zeller's Congruence formula: h = (q + (26 * (m + 1)) / 10.0) + k + (k / 4.0) + (j / 4.0) + (5 * j) % 7
		// Where q is the day, m is the month, k is the year of the century, and j is the century
		// Declare constant variables
		final int FIRST_NUMBER = 26;
		final int SECOND_NUMBER = 1;
		final double THIRD_NUMBER = 10.0;
		final double FOURTH_NUMBER = 4.0;
		final double FIFTH_NUMBER = FOURTH_NUMBER; // 4
		final int SIXTH_NUMBER = 5;
		final int SEVENTH_NUMBER = 7;
		final double YEARS_IN_CENTURY = 100.0;
		final String HEADER = "**********";
		
		// Declare non constant variables
		double dayOfWeek_Result;
		String dayOfWeek;
		int dayOfMonth;
		int month;
		double century;
		double yearOfCentury;
		int year;
		Scanner input = new Scanner(System.in);
		
		// Print header
		System.out.println(HEADER + "Zeller's Congruence" + HEADER);
		
		// Prompt user to enter a year, then record it into year
		System.out.print("Enter year (e.g. 2020): ");
		year = input.nextInt();
		
		// Prompt user to enter a month, then record it into month
		System.out.print("Enter month (1-12): ");
		month = input.nextInt();
		if (month == 1 || month == 2) {
			month += 12;
			year--;
		}
		
		// Prompt user to enter day of the month, store in dayOfMonth
		System.out.print("Enter the day of the month (1-31): ");
		dayOfMonth = input.nextInt();
		
		// Close the input
		input.close();
		
		// Calculate the century and year of the century. Century
		// is gotten with year / 100, year of century with year % 100
		century = year / YEARS_IN_CENTURY;
		yearOfCentury = year % YEARS_IN_CENTURY;
		
		// Calculate the day using the equation
		dayOfWeek_Result = (dayOfMonth + (int)((FIRST_NUMBER * (month + SECOND_NUMBER)) / THIRD_NUMBER) + yearOfCentury + (int)(yearOfCentury / FOURTH_NUMBER) 
                + (int)(century / FIFTH_NUMBER) + (SIXTH_NUMBER * century)) % SEVENTH_NUMBER;
		
		// Convert the number to a day using switch, 0 = Saturday, 1 = Sunday, 2 = Monday, 3 = Tuesday
		// 4 = Wednesday, 5 = Thursday, 6 = Friday
		// Show error in case there was a problem.
		switch((int)dayOfWeek_Result) {
			case 0:
				dayOfWeek = "Saturday";
				break;
			case 1:
				dayOfWeek = "Sunday";
				break;
			case 2:
				dayOfWeek = "Monday";
				break;
			case 3:
				dayOfWeek = "Tuesday";
				break;
			case 4:
				dayOfWeek = "Wednesday";
				break;
			case 5:
				dayOfWeek = "Thursday";
				break;
			case 6:
				dayOfWeek = "Friday";
				break;
			default:
				System.out.println("There was a computation error (This shouldn't show up). Result of dayOfWeek_Result: " + dayOfWeek_Result);
				dayOfWeek = null;
				break;
		}
		
		// Output the information to the user if dayOfWeek got assigned to something:
		if(dayOfWeek != null)
			System.out.println("Day of the week is " + dayOfWeek + "");
		
		// Show name
		System.out.println(HEADER + "By Michael Amaya" + HEADER);
	}
}
