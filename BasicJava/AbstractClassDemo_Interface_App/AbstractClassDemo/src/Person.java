public interface Person
{
	public void walk();

	public void eat();
}

abstract class Employee implements Person
{

}

class EmployeeImpl extends Employee
{

	@Override
	public void walk()
	{
		System.out.println("walking");
	}

	@Override
	public void eat()
	{
		System.out.println("eating");
	}

}