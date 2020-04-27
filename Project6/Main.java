/*
 * Class: CMSC201 
 * Instructor: Grinberg
 * Description: Create Account class and write methods for the class, then use the class in a program
 * Due: 03/08/2020
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Michael Amaya
*/

public class Main {

	public static void main(String[] args) {
		
		System.out.println("**********Account Program**********");
		
		// Create new Account object, with an ID of 1122, and initial balance of 20k
		// I wish I could have had that initial balance
		Account acc = new Account(1122, 20000);
		
		// Set the annual interest rate of the account to 4.5%
		acc.setAnnualInterestRate(4.5);
		
		// Withdraw $2500, balance is now 17500
		acc.withdraw(2500);
		
		// Deposit $3000, balance is now $20,500
		acc.deposit(3000);
		
		// Output The information of Account to the user.
		System.out.println(""
				+ "Balance: $" + acc.getBalance() + "\n"
				+ "Monthly interest rate:" + acc.getMonthlyInterestRate() + "\n"
				+ "Date created: " + acc.getDateCreated() + "\n"
				+ "");
		
		System.out.println("Programmer: Michael Amaya");
	}
}
