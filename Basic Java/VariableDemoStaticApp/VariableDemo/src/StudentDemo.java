public class StudentDemo
{

	public static void main(String[] args)
	{
		Student john = new Student();
		john.name = "John";
		john.age = 6;
		
		john.SchoolCode = 2000;
		

		Student dave = new Student();
		dave.name = "Dave";
		dave.age = 7;
		
		dave.SchoolCode = 3000;

		Student juli = new Student();
		juli.name = "juli";
		juli.age = 5;
		
		juli.SchoolCode = 5000;

		john.printInstanceAndStaticVariables();
		dave.printInstanceAndStaticVariables();
		juli.printInstanceAndStaticVariables();
	}

}
