/*
 * Class: CMSC201
 * Instructor: Grinberg
 * Description: Calculate the wind chill index by asking user the temperature and wind speed
 * Due: 02/02/2020
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Michael Amaya
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class WindChillTemperature {

	public static void main(String[] args) {
		
		//Declare constant variables for the formula: twc = 35.74 + 0.6215t - 35.75v^.16 + 0.4275tv^.16.
		final double FIRST_COEFFICIENT = 35.74;
		final double SECOND_COEFFICIENT = 0.6215;
		final double THIRD_COEFFICIENT = 35.75;
		final double FOURTH_COEFFICIENT = 0.4275;
		final double EXPONENT = 0.16;
		
		//Declare decimal format to only show two decimal places
		DecimalFormat twoDigits = new DecimalFormat("#.##");
		
		//Declare non-constant and input variables. Initialize input.
		double twc, temperature, windSpeed, calculatedWindSpeed;
		Scanner input = new Scanner(System.in);
		
		//Prompt user for the temperature in Fahrenheit and store it in variable temperature.
		System.out.print("Please enter the temperature in Fahrenheit "
				+ "between -58 degrees F and 41 degrees F: ");
		temperature = input.nextDouble();
		
		//Prompt user for the wind speed in miles per hour greater than 2, and store it in variable windSpeed.
		System.out.print("Please enter the wing speedd (>=2) in miles per hour: ");
		windSpeed = input.nextDouble();
		
		//Close input so it doesn't leak memory. I know it's not necessary, but the icon is annoying.
		input.close();
		
		//Calculate windSpeed to the power of variable EXPONENT to get that part of the formula, put it in variable calculatedWindSpeed.
		calculatedWindSpeed = Math.pow(windSpeed, EXPONENT);
		
		//Plug everything into the formula like so: 35.74  + (.6215 * temperature) - (35.75 * calculatedWindSpeed) + (0.4275 * temperature * calculatedWindSpeed)
		//Replace the numbers with the constant variables declared previously, put in variable twc.
		twc = FIRST_COEFFICIENT + (SECOND_COEFFICIENT * temperature) - (THIRD_COEFFICIENT * calculatedWindSpeed) + (FOURTH_COEFFICIENT * temperature * calculatedWindSpeed);
		
		//Display the information to the user
		System.out.println("The wind chill index is " + twoDigits.format(twc));
		
		//Display my name
		System.out.println("Programmer: Michael Amaya");
	}

}
