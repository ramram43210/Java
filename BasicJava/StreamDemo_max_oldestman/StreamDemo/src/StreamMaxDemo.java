import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamMaxDemo
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
		 * Similar to the min() operation, the max() is a special reduction
		 * operation that returns the maximum element in the stream according to
		 * the specified comparator.
		 * 
		 * The following code finds the oldest male person in the list:
		 */
		Optional<Person> optional = personList.stream()
				.filter(p -> p.getGender().equals(Gender.MALE))
				.max((p1, p2) -> p1.getAge() - p2.getAge());
		if (optional.isPresent())
		{
			Person oldestMan = optional.get();
			System.out.println("The oldest man is: " + oldestMan.getName()
					+ " (" + oldestMan.getAge() + ")");
		}

	}

}