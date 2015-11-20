public class Student
{

	/*
	 * private modifier—the field is accessible only within its own class.
	 * 
	 * In the spirit of encapsulation, it is common to make fields private. This
	 * means that they can only be directly accessed from the Student class. We
	 * still need access to these values, however. This can be done indirectly
	 * by adding public methods that obtain the field values for us:
	 */

	private String name;
	private int age;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

}