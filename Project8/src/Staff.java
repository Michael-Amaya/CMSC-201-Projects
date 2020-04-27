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
/** The Staff class describes attributes that only Staff should have
 *  Inherits everything from the Employee class, which inherits
 *  everything from the Person class
 *  
 * @author Michael Amaya
 *
 */
public class Staff extends Employee{
	private String title;	// The title of the Staff
	
	/** Constructor that inherits attributes and methods from Employee and Person
	 * 
	 * 
	 * @param name			The name of the Staff
	 * @param address		The address of the Staff
	 * @param phoneNumber	The phone number of the Staff
	 * @param emailAddress	The email address of the Staff
	 * @param officeNumber	The office number of the Staff
	 * @param salary		The salary of the Staff
	 * @param dateHired		The date hired of the Staff
	 * @param title			The title of the Staff
	 */
	public Staff(String name, String address, String phoneNumber, String emailAddress, int officeNumber, int salary, MyDate dateHired, String title) {
		super(name, address,phoneNumber, emailAddress, officeNumber, salary, dateHired);
		this.title = title;
	}

	/** Gets the Staff's title
	 * 
	 * @return The value of title
	 */
	public String getTitle() {
		return title;
	}

	/** Sets the Staff's title
	 * 
	 * @param title What to set title to
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/** Shows information for the Staff class
	 * 
	 * @return The attributes of the Staff class
	 * 
	 */
	@Override
	public String toString() {
		StringBuilder data = new StringBuilder();
		data.append("Staff: ").append(super.getName()).append("\n");
		data.append("Title: ").append(title).append("\n");
		data.append("Salary: ").append(super.getSalary()).append("\n");
		data.append("Hire Date: ").append(super.getDateHired().getDate()).append("\n\n");
		data.append("Office Number: ").append(super.getOfficeNumber()).append("\n");
		data.append("Address: ").append(super.getAddress()).append("\n");
		data.append("Phone Number: ").append(super.getPhoneNumber()).append("\n");
		data.append("Email Address: ").append(super.getEmailAddress());
		return data.toString();
	}
}
