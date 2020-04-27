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
/** The Employee class describes attributes of an employee
 *  The class inherits everything from the Person class
 * 
 * @author Michael Amaya
 *
 */
public class Employee extends Person{
	private int officeNumber;	// The employee's office number
	private int salary;		// The employee's salary
	private MyDate dateHired;	// The employee's hire date
	
	/** An employee class has everything that the person class has so we need
	 * to include that when creating the constructor
	 * 
	 * @param name			The name of the employee
	 * @param address		The address of the employee
	 * @param phoneNumber	The phone number of the employee
	 * @param emailAddress	The email address of the employee
	 * @param officeNumber	The office number of the employee
	 * @param salary		The salary of the employee
	 * @param dateHired		The date hired of the employee
	 */
	public Employee(String name, String address, String phoneNumber, String emailAddress, int officeNumber, int salary, MyDate dateHired) {
		super(name, address,phoneNumber, emailAddress);
		this.officeNumber = officeNumber;
		this.salary = salary;
		this.dateHired = dateHired;
	}

	/** Gets the office number
	 * 
	 * @return The value of officeNumber
	 */
	public int getOfficeNumber() {
		return officeNumber;
	}

	/** Sets the office number
	 * 
	 * @param officeNumber What to set officeNumber to
	 */
	public void setOfficeNumber(int officeNumber) {
		this.officeNumber = officeNumber;
	}

	/** Gets the Employee's salary
	 * 
	 * @return The value of salary
	 */
	public int getSalary() {
		return salary;
	}

	/** Gets the Employee's salary
	 * 
	 * @param salary Set the value of salary to this
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	/** Gets the dateHired with type MyDate
	 * 
	 * @return The MyDate object that holds the date hired
	 */
	public MyDate getDateHired() {
		return dateHired;
	}

	/** Sets the dateHired object, must be of type MyDate
	 * 
	 * @param dateHired What to set dateHired to
	 */
	public void setDateHired(MyDate dateHired) {
		this.dateHired = dateHired;
	}
}
