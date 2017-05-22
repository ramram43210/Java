import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaPredicateDemo
{
	public static void main(String[] args)
	{
		List<Person> personList = Arrays.asList(
				new Person("Carla", 33), new Person("Balu", 32),
				new Person("Bharth", 40), new Person("Ajay", 31));

		System.out.println("------------Name Starts with B---------");

		Predicate<Person> predicate = person -> person.getName().startsWith("B");

		printNameBeginWith_B(personList, predicate);

		System.out.println("----------------------------------------");

	}

	/*
	 * Method to print all people that have name begins with B.
	 */
	private static void printNameBeginWith_B(List<Person> personList,
			                                    Predicate<Person> predicate)
	{
		for (Person person : personList)
		{
			if (predicate.test(person))
			{
				System.out.println(person);
			}
		}

	}

}
