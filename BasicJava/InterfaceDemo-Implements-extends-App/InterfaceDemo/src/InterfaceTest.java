public class InterfaceTest
{

	public static void main(String[] args)
	{
		Employee employeeObj = new Employee();
		employeeObj.walk();
		int salary = employeeObj.getSalary();
		System.out.println("salary : "+salary);
	}

}
