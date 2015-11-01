public class Student
{
	String name; // instance variable
	int age; // instance variable
	
	static int schoolCode = 1000; // Static Variable
	
	void printInstanceAndStaticVariables()
	{
		System.out.println("Name : "+ name);
		System.out.println("Age : "+ age);
		System.out.println("SchoolCode : "+ schoolCode);
		System.out.println("**********************");
	}
}
