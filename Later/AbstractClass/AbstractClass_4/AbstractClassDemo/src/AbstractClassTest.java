
public class AbstractClassTest
{

	public static void main(String[] args)
	{
		 Person personRef = new EmployeeImpl();
		 personRef.eat();
		 personRef.walk();
		 
		 System.out.println("-------------------------");
		 
		 Employee employeeRef = new EmployeeImpl();
		 employeeRef.eat();
		 employeeRef.walk();
	}

}
