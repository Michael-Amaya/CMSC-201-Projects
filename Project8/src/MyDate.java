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
/** The MyDate class holds the a date that the user inputs
 * 
 * @author Unknown (Grinburg?)
 *
 */
public class MyDate {
	private String date;	// The date to hold
	
	/** Constructor that accepts a String for the date
	 * 
	 * @param date What to set the date to
	 */
	public MyDate(String date){
		this.date = date;
	}
	
	/** Gets the date
	 * 
	 * @return The value of date
	 */
	public String getDate() {
		return date;
	}
}
