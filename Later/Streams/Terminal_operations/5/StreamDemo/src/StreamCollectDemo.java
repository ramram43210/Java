import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamCollectDemo
{
	public static void main(String[] args)
	{
		List<Person> personList = new ArrayList<>();

		personList.add(new Person("Alice","alice@gmail.com",	Gender.FEMALE, 26));
		personList.add(new Person("Bob","bob@gmail.com", Gender.MALE, 32));
		personList.add(new Person("Carol","carol@gmail.com",Gender.FEMALE, 23));
		personList.add(new Person("David","david@gmail.com",	Gender.MALE, 39));
		personList.add(new Person("Eric","eric@gmail.com", Gender.MALE, 26));
		
		/*
		 * The collect() operation accumulates elements in a stream into a
		 * container such as a collection. It performs mutable reduction
		 * operation in which the reduced (final) value is a mutable result
		 * container such as an ArrayList. This method takes a Collector
		 * implementation that provides useful reduction operations. The
		 * Collectors class is a common implementation in the JDK. And we are
		 * going to see how it is used in the following examples.
		 * 
		 * The following code accumulates emails of the persons into a list
		 * collection:
		 */
		List<String> listEmails = personList.stream().map(p -> p.getEmail())
													  .collect(Collectors.toList());

		System.out.println("listEmails = "+ listEmails);
		
		/*
		 * We can specify exactly which type of collection as the result. For
		 * example, the following code collects emails into a TreeSet:
		 */
		Set<String> setEmails = personList.stream()
                .map(p -> p.getEmail())
                .collect(Collectors.toCollection(TreeSet::new));
		
		System.out.println("setEmails = "+ setEmails);
		
		/*
		 * The following code groups the person by gender:
		 */
		Map<Gender, List<Person>> byGenderMap = personList.stream()
				.collect(Collectors.groupingBy(p -> p.getGender()));

		System.out.println("Groups by gender = " + byGenderMap);
		
		/*
		 * The following code accumulates names and concatenates them into
		 * a String, separated by commas:
		 */
		String names = personList.stream().map(p -> p.getName())
				.collect(Collectors.joining(", "));
		
		System.out.println("names = "+names);
		
	}

}