import java.util.ArrayList;
import java.util.List;

public class StreamForEachDemo
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
		 * The forEach() operation performs an action for each element in the
		 * stream, thus creating a side effect, such as print out information of
		 * each female person as shown in the following code:
		 */
		personList.stream().filter(p -> p.getGender().equals(Gender.FEMALE))
													.forEach(System.out::println);

	}

}