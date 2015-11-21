public class EmployeeDemoTest
{

	public static void main(String[] args)
	{
		Employee davidEmployee = new Employee("David", 25);
		System.out.println("Name : " + davidEmployee.getName());
		System.out.println("Age  : " + davidEmployee.getAge());
		System.out.println("-------------------------------");
		Employee johnEmployee = new Employee("John", 45);
		System.out.println("Name : " + johnEmployee.getName());
		System.out.println("Age  : " + johnEmployee.getAge());

	}

}
