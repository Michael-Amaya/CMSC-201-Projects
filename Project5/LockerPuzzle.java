/*
 * Class: CMSC201 
 * Instructor: Grinberg
 * Description: Use an array and loop through the array to make an nth student close or open every nth locker until you get to the nth locker
 * Due: 03/01/2020
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Michael Amaya
*/

public class LockerPuzzle {

	public static void main(String[] args) {
		// Declare array of lockers of size 101 because it starts at locker 1, adding 100 is 101
		boolean[] lockers = new boolean[101];
		
		// Open all the lockers
		for (int i = 1; i < lockers.length; i++)
			lockers[i] = true;
		
		// Start at locker 2 since locker 1 is always open with the logic where the second
		// iteration will always pass 1.
		for (int i = 2; i <= 100; i++)
			// For every iteration i, or student, it needs to open the next locker so you do i *j
			// because the next student i will  
			for (int j = 1; i * j <= 100; j++)
				// Set the lockers to the opposite of what it was
				// So if it was opened, it'll close and vice versa
				lockers[i * j] = !lockers[i * j];
		
		// Check for open lockers.
		for (int i = 1; i < lockers.length; i++) 
			if (lockers[i])
				// Print only if the locker is open
				System.out.println("locker " + i + " is open.");
		
		// Print name
		System.out.println("Programmer: Michael Amaya");
	}
}
