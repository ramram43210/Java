public class Employee implements Comparable<Object>
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

	@Override
	public String toString()
	{
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary
				+ "]";
	}

	/*
	 * This method has logic to arrange the employee objects in descending order
	 * based on the Name.
	 */
	@Override
	public int compareTo(Object object)
	{

		Employee employee = (Employee) object;

		System.out
				.print("CompareTo method has been called to arrange the employee objects in descending order based on the Name, ");

		System.out.println("this.getName()= " + this.getName()
				+ ", employee.getName()=" + employee.getName() + "\n");

		return employee.getName().compareTo(this.getName());
	}

}
