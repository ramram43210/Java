import java.util.ArrayList;
import java.util.List;

public class StreamFilterDemo
{
	public static void main(String[] args)
	{
		List<Person> personList = new ArrayList<>();

		personList.add(new Person("Alice","alice@gmail.com",Gender.FEMALE, 16));
		personList.add(new Person("Bob","bob@gmail.com", Gender.MALE, 15));
		personList.add(new Person("Carol","carol@gmail.com",Gender.FEMALE, 23));
		personList.add(new Person("David","david@gmail.com",	Gender.MALE, 19));
		personList.add(new Person("Eric","eric@gmail.com", Gender.MALE, 26));
		
		System.out.println("--------Filterd based on FEMALE--------");
		
		/*
		 * The filter() operation returns a new stream that consists elements
		 * matching a given condition which is typically a boolean test in form
		 * of a Lambda expression.
		 * 
		 * The following code lists only female persons:
		 */
		personList.stream().filter(p -> p.getGender().equals(Gender.FEMALE))
												.forEach(System.out::println);
		
		
		System.out.println("\n--------Filterd based on Male and Age<=25--------");
		
		/*
		 * The following code shows only male who are under 25:
		 */
		personList.stream().filter(p -> p.getGender().equals(Gender.MALE) && p.getAge() <= 25)
				.forEach(System.out::println);

	}

}