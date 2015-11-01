
public class EmployeeDemo
{

	public static void main(String[] args)
	{
		Employee employeeObj = new Employee();
		
		/*
		 *  Accessing the instance variable's name and age.
		 */
		employeeObj.name = "Peter";
		employeeObj.age = 32;
		
		System.out.println("name : "+employeeObj.name);
		System.out.println("age : "+employeeObj.age);
		

		/*
		 *  Accessing the static variable companyCode.
		 */
		System.out.println("companyCode : "+Employee.companyCode);
		
		int salary = employeeObj.getSalary();
		System.out.println("salary : "+salary);

	}

}
