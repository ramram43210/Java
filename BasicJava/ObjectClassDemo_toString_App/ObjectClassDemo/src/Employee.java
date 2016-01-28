public class Employee
{
	private String name;
	private int age;
	private int salary;

	public Employee(String name, int age, int salary)
	{
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
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

	public int getSalary()
	{
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}

	/*
	 * Returns a string representation of the object,
	 * which is very useful for debugging.
	 *
	 * In general, the toString method returns a string that
	 * "textually represents" this object.
	 *
	 * The result should be a concise but informative
	 * representation that is easy for a person to read. It
	 * is recommended that all subclasses override this
	 * method.
	 */

	@Override
	public String toString()
	{
		System.out.println("toString() method is called.");
		return "Employee [name=" + name + ", age=" + age
				+ ", salary=" + salary + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
