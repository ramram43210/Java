public class StudentDemo
{

	public static void main(String[] args)
	{
		Student john = new Student();
		john.name = "John";
		john.age = 6;
		
		/*
		 * Using Class name we can access class variable
		 * or static variable 
		 */
		
		Student.schoolCode = 5000;
		

		Student dave = new Student();
		dave.name = "Dave";
		dave.age = 7;
		
		
		Student juli = new Student();
		juli.name = "juli";
		juli.age = 5;
		
		
		john.printInstanceAndStaticVariables();
		dave.printInstanceAndStaticVariables();
		juli.printInstanceAndStaticVariables();
	}

}
