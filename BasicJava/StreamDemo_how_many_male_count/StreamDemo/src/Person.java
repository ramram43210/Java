enum Gender
{
	MALE, FEMALE
}

public class Person
{
	private String name;
	private String email;
	private Gender gender;
	private int age;

	public Person(String name, String email, Gender gender, int age)
	{
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public Gender getGender()
	{
		return gender;
	}

	public void setGender(Gender gender)
	{
		this.gender = gender;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	@Override
	public String toString()
	{
		return "Person [name=" + name + "]";
	}

}