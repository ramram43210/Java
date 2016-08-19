/*
 * We can serialize the Employee class object that
 * extends the Person class which is Serializable.Parent
 * class properties are inherited to subclasses so if
 * parent class is Serializable, subclass would also be.
 */
public class Employee extends Person
{

	private static final long serialVersionUID = 312396230370712755L;
	private int salary;

	public Employee(String name, int age, int salary)
	{
		super(name, age);
		this.salary = salary;
	}

	public int getSalary()
	{
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}

}