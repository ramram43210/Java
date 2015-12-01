public class Student
{
	public static void main(String args[])
	{
		Person personRef = new Person()
		{
			public void walk()
			{
				System.out.println("Walking fast");
			}

		};
		
		personRef.walk();
	}

}
