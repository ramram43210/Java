import java.util.ArrayList;
import java.util.List;

public class StreamCountDemo
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
		 * The count() operation simply returns total number of elements in the
		 * stream.
		 *
		 * The following code finds how many people are male:
		 */
		long totalMale = personList.stream()
				.filter(p -> p.getGender().equals(Gender.MALE)).count();
		System.out.println("Total male = " + totalMale);

	}

}