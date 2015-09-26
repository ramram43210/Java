public class StudentDemo
{

	public static void main(String[] args)
	{
		Student john = new Student();
		john.name = "John";
		john.age = 6;

		Student dave = new Student();
		dave.name = "Dave";
		dave.age = 7;

		Student juli = new Student();
		juli.name = "juli";
		juli.age = 5;

		john.printInstanceVariable();
		dave.printInstanceVariable();
		juli.printInstanceVariable();
	}

}
