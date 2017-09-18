import java.util.ArrayList;
import java.util.List;

public class StreamSortDemo
{
	public static void main(String[] args)
	{
		List<Person> personList = new ArrayList<>();

		personList.add(new Person("Alice", "alice@gmail.com", Gender.FEMALE, 16));
		personList.add(new Person("Bob", "bob@gmail.com", Gender.MALE, 15));
		personList.add(new Person("Carol", "carol@gmail.com", Gender.FEMALE, 23));
		personList.add(new Person("David", "david@gmail.com", Gender.MALE, 19));
		personList.add(new Person("Eric", "eric@gmail.com", Gender.MALE, 26));

		/*
		 * The Stream API provides two overloads of the sorted operation that
		 * returns a new stream consisting elements sorted according to natural
		 * order or by a specified comparator:
		 *
		 * 1.sorted(): sorts by natural order
		 * 2.sorted(comparator): sorts by a comparator
		 *
		 * The following code returns a stream of persons who are sorted by
		 * their age into ascending order:
		 *
		 */

		System.out.println("----------Sorted by Age-------------------");

		personList.stream().sorted()
				.forEach(p -> System.out.println(p));


		System.out.println("\n----------Sorted by Name-------------------");

		/*
		 * The following code shows how to use a specified comparator to return
		 * a stream of persons who are sorted by their name:
		 */
		personList.stream()
				.sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
				.forEach(System.out::println);
	}

}