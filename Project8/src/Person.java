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
/** The Person class is a class that holds what every person has
 * A name, address, phone number, and email address
 * 
 * @author Michael Amaya
 *
 */
public class Person {
	private String name;			// The name of the person
	private String address;			// The address of the person
	private String phoneNumber;		// The phone number of the person
	private String emailAddress;	// The email address of the person
	
	/** Constructor that gets all the info of a person
	 * 
	 * @param name			The name of the person
	 * @param address		The address of the person
	 * @param phoneNumber	The phone number of the person
	 * @param emailAddress	The email address of the person
	 */
	public Person(String name, String address, String phoneNumber, String emailAddress) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}

	/** Gets the name of the person.
	 * 
	 * @return The value of name
	 */
	public String getName() {
		return name;
	}

	/** Sets the name of the person
	 * 
	 * @param name The value to set to person. 
	 */
	public void setName(String name) {
		this.name = name;
	}

	/** Gets the address of the person
	 * 
	 * @return The value of person
	 */
	public String getAddress() {
		return address;
	}
	
	/** Sets the person's address
	 * 
	 * @param address What to set the person's address to
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/** Gets the phone number of the person
	 * 
	 * @return the value of phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/** Sets the person's phone number
	 * 
	 * @param phoneNumber What to change the phoneNumber to
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/** Gets the email address of the person
	 * 
	 * @return The value of emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/** Sets the emailAddress
	 * 
	 * @param emailAddress What to set emailAddress to
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	
}
