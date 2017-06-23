
public class Student
{
	private String first; // first name
	private String last; // last name
	private String email; // email address
	private int section; // section number

	// construct a new student with given fields
	public Student(String first, String last, String email, int section)
	{
		this.first = first;
		this.last = last;
		this.email = email;
		this.section = section;
	}

	public void showStudentFullName()
	{
		System.out.println(first+last);
	}

	// return a string representation of the invoking object
	public String toString()
	{
		return section + " " + first + " " + last + " " + email;
	}
}
