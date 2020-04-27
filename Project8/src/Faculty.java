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
/** The Faculty class has attributes that Faculty need to have
 * Inherits everything from the Employee class, which inherits everything
 * from the Person class
 * 
 * @author Michael Amaya
 *
 */
public class Faculty extends Employee{
	private String officeHours;		// The office hours for the Faculty
	private String rank;			// The rank of the faculty
	
	/** Constructor that extends the Employee class, inherits everything from it
	 * and from Person
	 * 
	 * @param name			The name of the faculty
	 * @param address		The address of the faculty
	 * @param phoneNumber	The phone number of the faculty
	 * @param emailAddress	The email adress of the faculty
	 * @param officeNumber	The office number of the faculty
	 * @param salary		The salary of the faculty
	 * @param dateHired		The date hired of the faculty
	 * @param officeHours	The office hours of the faculty
	 * @param rank			The rank of the faculty
	 */
	public Faculty(String name, String address, String phoneNumber, String emailAddress, int officeNumber, int salary, MyDate dateHired, String officeHours, String rank) {
		super(name, address,phoneNumber, emailAddress, officeNumber, salary, dateHired);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	/** Gets the office hours of the faculty
	 * 
	 * @return The value of officeHours
	 */
	public String getOfficeHours() {
		return officeHours;
	}

	/** Sets the office hours
	 * 
	 * @param officeHours What to set officeHours to
	 */
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	/** Gets the rank of the faculty
	 * 
	 * @return The value of rank
	 */
	public String getRank() {
		return rank;
	}

	/** Sets the rank of the faculty
	 * 
	 * @param rank What to set rank to
	 */
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	/** Gives all the information of the faculty
	 * 
	 * @return The attributes of the faculty
	 * 
	 */
	@Override
	public String toString() {
		StringBuilder data = new StringBuilder();
		data.append("Faculty: ").append(super.getName()).append("\n");
		data.append("Rank: ").append(rank).append("\n");
		data.append("Salary: ").append(super.getSalary()).append("\n");
		data.append("Hire Date: ").append(super.getDateHired().getDate()).append("\n\n");
		data.append("Office Hours: ").append(officeHours).append("\n");
		data.append("Office Number: ").append(super.getOfficeNumber()).append("\n");
		data.append("Address: ").append(super.getAddress()).append("\n");
		data.append("Phone Number: ").append(super.getPhoneNumber()).append("\n");
		data.append("Email Address: ").append(super.getEmailAddress());
		return data.toString();
	}
}
