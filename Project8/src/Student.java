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
/** The student class describes a student
 *  Inherits all attributes from th Person class
 * 
 * @author Michael Amaya
 *
 */
public class Student extends Person{
	private final String STATUS;	// The student status
	
	/** Constructor to create a student
	 * 
	 * @param name			The name of the Student
	 * @param address		The address of the student
	 * @param phoneNumber	The phone number of the student
	 * @param emailAddress	The email address of the student
	 * @param status		The status of the student. i.e. Freshman, Sophomore, Junior, Senior
	 */
	public Student(String name, String address, String phoneNumber, String emailAddress, String status) {
		super(name, address,phoneNumber, emailAddress);
		STATUS = status;
	}
	
	/** Gets the status of the student
	 * 
	 * @return the value of STATUS
	 */
	public String getSTATUS() {
		return STATUS;
	}
	
	/** Returns information about the student
	 * 
	 * @return The student's attributes
	 */
	@Override
	public String toString() {
		StringBuilder data = new StringBuilder();
		data.append("Student: ").append(super.getName()).append("\n");
		data.append("Status: ").append(STATUS).append("\n");
		data.append("Address: ").append(super.getAddress()).append("\n");
		data.append("Phone Number: ").append(super.getPhoneNumber()).append("\n");
		data.append("Email Address: ").append(super.getEmailAddress());
		return data.toString();
	}
}
