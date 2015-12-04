public class Address
{

	private String country;
	private String city;

	public Address(String country, String city)
	{
		this.country = country;
		this.city = city;
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public Student getStudentWithAddress(String name, int age)
	{
		/*
		 * The this keyword can be passed as argument in the constructor call.
		 * 
		 * It is useful if we have to use one object in multiple classes.
		 */
		Student student = new Student(name, age, this);
		return student;
	}
}
