
public class EmployeeTest
{

	public static void main(String[] args)
	{
		Employee johnReferenceVariable = new Employee("John", 25);
		
		System.out.println("name : "+ johnReferenceVariable.name );
		System.out.println("age : "+ johnReferenceVariable.age );
		
		int salary = johnReferenceVariable.getSalaryInfo();
		System.out.println("salary : "+salary);
		
	}

}
