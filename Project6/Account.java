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
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * This Account class keeps track of how much money
 * a person has, and lets them withdraw and deposit money
 * Michael Amaya - 03/03/2020
 * 
 * @author Michael Amaya
 *
 */
public class Account {
	private int id = 0;											// ID for the account
	private double balance = 0;									// Initial balance for the account
	private double annualInterestRate = 0;							// Annual interest rate for the account
	private Date dateCreated = Calendar.getInstance().getTime();	// Current day for the date created.
	
	/**
	 * Blank constructor designed to create an account
	 * with a random ID and random balance
	 */
	public Account() {
		Random randomMaker = new Random(System.currentTimeMillis());
		id = randomMaker.nextInt(20000) + 10000;
		balance = (double) randomMaker.nextInt(10000);
	}
	
	/**
	 * Constructor designed to instantiate an Account object
	 * and set the ID and Initial Balance
	 * @param id The ID for the account
	 * @param balance The initial balance of the account
	 */
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	/**
	 * Get's the ID of the account
	 * @return The accounts ID
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Sets the account ID to what the user wants
	 * @param id Set's the account ID to this
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Gets the balance of the account
	 * @return
	 */
	public double getBalance() {
		return balance;
	}
	
	/**
	 * Sets the account balance to what the user wants
	 * @param balance The balance that the Account balance should be set to
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	 * Gets the annual interest rate of the account
	 * @return The account's annual interest rate
	 */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	/**
	 * Sets the annual interest rate to what the user wants
	 * @param rate The value that the annual interest rate should be
	 */
	public void setAnnualInterestRate(double rate) {
		annualInterestRate = rate;
	}
	
	/**
	 * Gets the date the account was created
	 * @return The date the account was created
	 */
	public Date getDateCreated() {
		return dateCreated;
	}
	
	/**
	 * Gets the monthly interest rate by dividing
	 * the annual interest rate by 12
	 * @return The monthly interest rate
	 */
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12.0;
	}
	
	/**
	 * Deposits money into the account
	 * @param money The money that needs to be deposited to the account
	 */
	public void deposit(double money) {
		balance+=money;
	}
	
	/**
	 * Withdraws money from the account, checks to make sure that there is
	 * enough money or nothing will happen
	 * @param money
	 */
	public void withdraw(double money) {
		// Check if the balance afterwards is greater than or equal to 0,
		// If it is, subtract the money from the account
		// If it's not, print an error and the current balance
		if(balance - money >= 0) {
			balance -= money;
		} else {
			System.out.println("Not enough money in account,\n"
					+ "Balance unchanged: $" + balance);
		}
	}
	
}
