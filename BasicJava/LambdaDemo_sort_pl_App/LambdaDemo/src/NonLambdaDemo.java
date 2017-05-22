import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Before JDK 8
 * 
 * With out lambda expression how to sort the list of person by name
 * 
 */
public class NonLambdaDemo
{
	public static void main(String[] args)
	{
		List<Person> personList = Arrays.asList(
				new Person("Carla", 33), new Person("Balu", 32),
				new Person("Bharth", 40), new Person("Ajay", 31));

		System.out.println("------------Before Sort by name---------");

		printAll(personList);

		System.out.println("----------------------------------------");

		/*
		 * Sort list by Name,Before JDK 8
		 */

		Collections.sort(personList, new Comparator<Person>()
		{
			@Override
			public int compare(Person p1, Person p2)
			{
				return p1.getName().compareTo(p2.getName());
			}
		});

		System.out.println("\n------------After Sort by name---------");
		/*
		 * Create a method that prints all elements in the list.
		 */

		printAll(personList);

		System.out.println("----------------------------------------");

	}

	private static void printAll(List<Person> personList)
	{
		for (Person person : personList)
		{
			System.out.println(person);
		}

	}
}
