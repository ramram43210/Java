public class Employee extends Salary implements Person
{
	@Override
	public void walk()
	{
		System.out.println("Employee walks slow");
	}

}
