public class Student
{
	public static void main(String args[])
	{
		Person personRef = new Person()
		{
			void walk()
			{
				System.out.println("Walking fast");
			}

		};
		
		personRef.walk();
	}

}
