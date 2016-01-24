public class Employee extends Person
{
	private int salary;

	public Employee(String name, int age)
	{
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, int salary)
	{
		super(name, age);
		this.salary = salary;
	}

}
