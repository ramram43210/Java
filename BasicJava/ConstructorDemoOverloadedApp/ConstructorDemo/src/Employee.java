public class Employee
{

	private String name;
	private int age;

	public Employee()
	{
		System.out.println("Inside Employee() constructor");
	}

	public Employee(String name)
	{
		System.out.println("Inside  Employee(String name) constructor");
		this.name = name;
	}

	public Employee(String name, int age)
	{
		System.out.println("Inside  Employee(String name,int age) constructor");
		this.name = name;
		this.age = age;
	}

	public Employee(int age)
	{
		System.out.println("Inside  Employee(int age) constructor");
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

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

}
