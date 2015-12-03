public class InterfaceTest
{

	public static void main(String[] args)
	{
		Person personStudentRef = new Student();
		personStudentRef.walk();
		personStudentRef.sayHello();
		
		System.out.println("----------------------");
		
		Person personEmployeeRef = new Employee();
		personEmployeeRef.walk();
		personEmployeeRef.sayHello();
	}

}
