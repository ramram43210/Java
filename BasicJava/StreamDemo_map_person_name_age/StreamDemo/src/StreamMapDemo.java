import java.util.ArrayList;
import java.util.List;

public class StreamMapDemo
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
		 * The map operation returns a new stream consisting of elements which
		 * are the results of applying a given function to the elements of the
		 * current stream. For example, converting a stream of Objects to a
		 * stream of String or a stream of primitive numbers.
		 *
		 * The Stream API provides 4 methods for the map operation:
		 *
		 * map(): transforms a stream of objects of type T to a stream of
		 * objects of type R.
		 *
		 * mapToInt(): transforms a stream of objects to a stream of int
		 * primitives.
		 *
		 * mapToLong(): transforms a stream of objects to a stream of long
		 * primitives.
		 *
		 * mapToDouble(): transforms a stream of objects to a stream of double
		 * primitives.
		 *
		 */
		
		personList.stream()                     // Stream<Person>
		          .map(p -> p.getEmail())      //  Stream<String>
		          .forEach(System.out::println);

		System.out.println("\n----------------------\n");
		
		personList.stream()  // Stream<Person>
				  .map(p -> p.getName().toUpperCase()) //  Stream<String>
                  .forEach(System.out::println);

		System.out.println("\n----------------------\n");

		personList.stream()  // Stream<Person>
		          .mapToInt(p -> p.getAge()) //IntStream
		          .forEach(age -> System.out.println(age));

	}

}