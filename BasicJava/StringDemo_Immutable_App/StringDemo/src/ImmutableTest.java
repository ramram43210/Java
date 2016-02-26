public class ImmutableTest
{

	public static void main(String[] args)
	{

		Person personObj = new Person("Peter");
		System.out.println(personObj.name);
		System.out.println(personObj.getName());

		//personObj.name = "Dave";

	}

}
