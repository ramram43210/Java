import java.util.Arrays;
import java.util.List;

public class LambdaDemo
{
	public static void main(String[] args)
	{
		List<Person> personList = Arrays.asList(
				new Person("Carla", 33), new Person("Balu", 32),
				new Person("Bharth", 40), new Person("Ajay", 31));

		System.out.println("------------Name Starts with B---------");
		/*
		 * Create a method that prints all people that have name
		 * begins with B.
		 */
		printNameBeginWith_B(personList,
				p -> p.getName().startsWith("B"));

		System.out
				.println("----------------------------------------");

	}

	private static void printNameBeginWith_B(List<Person> personList,
			Condition condition)
	{
		for (Person person : personList)
		{
			if (condition.test(person))
			{
				System.out.println(person);
			}
		}

	}

}
