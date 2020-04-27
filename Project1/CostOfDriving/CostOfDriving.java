/*
 * Class: CMSC201
 * Instructor: Grinberg
 * Description: Calculate the fuel cost or cost of driving by asking user the driving distance, miles per gallon, and price per gallon. 
 * Due: 02/02/2020
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Michael Amaya
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class CostOfDriving {

	public static void main(String[] args) {
		//Declare holder variables to hold the user input (Driving distance, miles per gallon, and price per gallon) and calcution variables
		double drivingDistance, milesPerGallon, pricePerGallon, calculateGallons, costOfDriving;
		
		//Declare decimal format to show only 2 decimal places
		DecimalFormat moneyFormat = new DecimalFormat("#.##");
		
		//Declare scanner to get user input
		Scanner input = new Scanner(System.in);
		
		//Ask user for driving distance and store in variable drivingDistance.
		System.out.print("Please enter the driving distance (in miles): ");
		drivingDistance = input.nextDouble();
		
		//Ask user for how many miles per gallon their car, store in variable milesPerGallon
		System.out.print("Please enter the miles your car runs per gallon of gas: ");
		milesPerGallon = input.nextDouble();
		
		//Ask user what the price of gas per gallon is:
		System.out.print("Please enter the price of gas per gallon: ");
		pricePerGallon = input.nextDouble();
		
		//Close input to remove icon
		input.close();
		
		//Calculate how many gallons they need to refill
		calculateGallons = drivingDistance / milesPerGallon;
		
		//Calculate the driving cost now
		costOfDriving = calculateGallons * pricePerGallon;
		
		//Show user what the cost of driving is
		System.out.println("The cost of driving is $" + moneyFormat.format(costOfDriving));
		
		//Show my name
		System.out.println("Programmer: Michael Amaya");
	}

}
