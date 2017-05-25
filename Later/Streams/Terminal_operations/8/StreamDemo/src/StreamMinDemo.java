import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamMinDemo
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
		 * The min(comparator) is a special reduction operation that returns the
		 * minimum element in the stream according to the provided comparator.
		 * It returns an Optional which is a container object that contains the
		 * value. 
		 * 
		 * For example, the following code snippet finds the youngest
		 * female person in the list:
		 */
		Optional<Person> optional = personList.stream()
				.filter(p -> p.getGender().equals(Gender.FEMALE))
				.min((p1, p2) -> p1.getAge() - p2.getAge());
		
		if (optional.isPresent())
		{
			Person youngestGirl = optional.get();
			System.out.println("The youngest girl is: " + youngestGirl.getName()
					+ " (" + youngestGirl.getAge() + ")");
		}
		
	}

}