import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaPredicateConsumerDemo
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
				p -> p.getName().startsWith("B"),
				p -> System.out.println(p));

		System.out.println("----------------------------------------");

		printNameBeginWith_B(personList,
				p -> p.getName().startsWith("B"),
				p -> System.out.println(p.getName()));

		System.out.println("----------------------------------------");
		
		printNameBeginWith_B(personList,
				p -> p.getName().startsWith("B"),
				p -> System.out.println(p.getAge()));

	}

	private static void printNameBeginWith_B(List<Person> personList,
			Predicate<Person> predicate, Consumer<Person> consumer)
	{
		for (Person person : personList)
		{
			if (predicate.test(person))
			{
				consumer.accept(person);
			}
		}

	}

}
