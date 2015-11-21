public class EmployeeDemoTest
{

	public static void main(String[] args)
	{

		Employee employeeObject1 = new Employee();
		System.out.println("Name : " + employeeObject1.getName());
		System.out.println("Age  : " + employeeObject1.getAge());

		System.out.println("------------------------------------");

		Employee employeeObject2 = new Employee("Dave");
		System.out.println("Name : " + employeeObject2.getName());
		System.out.println("Age  : " + employeeObject2.getAge());

		System.out.println("------------------------------------");

		Employee employeeObject3 = new Employee("John", 45);
		System.out.println("Name : " + employeeObject3.getName());
		System.out.println("Age  : " + employeeObject3.getAge());
		
		System.out.println("------------------------------------");

		Employee employeeObject4 = new Employee(54);
		System.out.println("Name : " + employeeObject4.getName());
		System.out.println("Age  : " + employeeObject4.getAge());

	}

}
