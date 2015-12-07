public class InterfaceTest
{

	public static void main(String[] args)
	{
		Employee peterObj = new Employee();
		peterObj.walk();
		int salary = peterObj.getSalary();
		System.out.println("salary : "+salary);
	}

}
