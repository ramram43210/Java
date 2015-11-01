public class Employee
{
	String name; // instance variable
	int age; // instance variable

	static int companyCode = 2000; // static variable

	public int getSalary()
	{
		int salary = 60000; // local variable
		int tax = 10000; // local variable
		salary = salary - tax;
		return salary;
	}

}
