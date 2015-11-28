
public class EmployeeTest
{

	public static void main(String[] args)
	{
		Employee johnReferenceVariable = new Employee("John", 25);
		Employee peterReferenceVariable = new Employee("Peter", 28);
		
		System.out.println("name : "+ johnReferenceVariable.name );
		System.out.println("age : "+ johnReferenceVariable.age );
		
		System.out.println("------------------------------------------");
		
		System.out.println("name : "+ peterReferenceVariable.name);
		System.out.println("age : "+ peterReferenceVariable.age );
	}

}
