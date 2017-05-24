import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectDemo
{
	public static void main(String[] args)
	{
		List<Person> listPersons = new ArrayList<>();

		listPersons.add(new Person("Alice","alice@gmail.com",	Gender.FEMALE, 26));
		listPersons.add(new Person("Bob","bob@gmail.com", Gender.MALE, 32));
		listPersons.add(new Person("Carol","carol@gmail.com",Gender.FEMALE, 23));
		listPersons.add(new Person("David","david@gmail.com",	Gender.MALE, 39));
		listPersons.add(new Person("Eric","eric@gmail.com", Gender.MALE, 26));
		listPersons.add(new Person("Frank","frank@gmail.com",Gender.MALE, 33));
		listPersons.add(new Person("Gibb","gibb@gmail.com", Gender.MALE, 27));
		listPersons.add(new Person("Henry","henry@gmail.com",	Gender.MALE, 30));
		listPersons.add(new Person("Isabell","isabell@gmail.com",Gender.FEMALE, 22));
		listPersons.add(new Person("Jane","jane@gmail.com",Gender.FEMALE, 24));

		/*
		 * The collect() operation accumulates elements in a stream into a
		 * container such as a collection. It performs mutable reduction
		 * operation in which the reduced (final) value is a mutable result
		 * container such as an ArrayList. This method takes a Collector
		 * implementation that provides useful reduction operations. The
		 * Collectors class is a common implementation in the JDK. And we are
		 * going to see how it is used in the following examples.
		 *
		 * The following example accumulates emails of the persons into a list
		 * collection:
		 */
		List<String> listEmails = listPersons.stream().map(p -> p.getEmail())
													  .collect(Collectors.toList());

		listEmails.forEach(email -> System.out.println(email));
	}

}