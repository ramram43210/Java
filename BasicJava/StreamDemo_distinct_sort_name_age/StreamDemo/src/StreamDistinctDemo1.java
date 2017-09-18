import java.util.ArrayList;
import java.util.List;

public class StreamDistinctDemo1
{
	public static void main(String[] args)
	{
		List<Person> personList = new ArrayList<>();

		personList.add(new Person("Alice", "alice@gmail.com", Gender.FEMALE, 15));
		personList.add(new Person("Bob", "bob@gmail.com", Gender.MALE, 15));
		personList.add(new Person("Carol", "carol@gmail.com", Gender.FEMALE, 23));
		personList.add(new Person("David", "david@gmail.com", Gender.MALE, 19));
		personList.add(new Person("Eric", "eric@gmail.com", Gender.MALE, 15));

		/*
		 * The distinct() operation returns a stream consisting of the distinct
		 * elements (no duplicates) by comparing objects via their equals()
		 * method.
		 * 
		 * Combining with the map and sorted operations, the following code
		 * shows distinct age of the persons in the above list, and sorts them
		 * in asc order:
		 * 
		 */
		personList.stream().mapToInt(p -> p.getAge()).distinct().sorted()
				.forEach(System.out::println);
	}

}