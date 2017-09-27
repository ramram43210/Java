import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamReduceDemo1
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
		 * 
		 * Version #1: Optional<T> reduce(BinaryOperator<T> accumulator) - This
		 * method performs a reduction on the elements of the stream, using an
		 * associative accumulation function, and returns an Optional object
		 * describing the reduced value.
		 * 
		 * For example, the following code accumulates names of all persons into
		 * a String:
		 */
		Optional<String> optional = personList.stream().map(p -> p.getName())
				.reduce((name1, name2) -> name1 + ", " + name2);

		if (optional.isPresent())
		{
			String names = optional.get();
			System.out.println(names);
		}

	}

}