/**
 * 
 * Student class extends Person class means Student IS-A Person.
 * 
 * Student extends Person and thus inherits all methods and properties from
 * Person (except final and static).
 * 
 * Student can also define all its specific functionality.
 */
public class Student extends Person
{

	private double grade;
	private int rollNo;

	/*
	 * Student HAS-A Address
	 */
	private Address address;

	public Student(String name, int age, double grade, int rollNo,
			Address address)
	{
		super(name, age);
		this.grade = grade;
		this.rollNo = rollNo;
		this.address = address;
	}

	public double getGrade()
	{
		return grade;
	}

	public void setGrade(double grade)
	{
		this.grade = grade;
	}

	public int getRollNo()
	{
		return rollNo;
	}

	public void setRollNo(int rollNo)
	{
		this.rollNo = rollNo;
	}

	public Address getAddress()
	{
		return address;
	}

	public void setAddress(Address address)
	{
		this.address = address;
	}

	@Override
	public String toString()
	{
		return "Student [grade=" + grade + ", rollNo=" + rollNo + ", address="
				+ address + ", getName()=" + getName() + ", getAge()="
				+ getAge() + "]";
	}

}
