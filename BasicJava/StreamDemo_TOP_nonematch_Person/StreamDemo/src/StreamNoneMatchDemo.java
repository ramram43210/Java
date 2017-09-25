import java.util.ArrayList;
import java.util.List;

public class StreamNoneMatchDemo
{
	public static void main(String[] args)
	{
		List<Person> personList = new ArrayList<>();

		personList.add(new Person("Alice","alice@gmail.com",	Gender.FEMALE, 26));
		personList.add(new Person("Bob","bob@gmail.com", Gender.MALE, 32));
		personList.add(new Person("Carol","carol@gmail.com",Gender.FEMALE, 23));
		personList.add(new Person("David","david@gmail.com",	Gender.MALE, 39));
		personList.add(new Person("Eric","eric@gmail.com", Gender.MALE, 26));
		personList.add(new Person("Frank","frank@gmail.com",Gender.MALE, 33));
		personList.add(new Person("Gibb","gibb@gmail.com", Gender.MALE, 27));
		personList.add(new Person("Henry","henry@gmail.com",	Gender.MALE, 30));
		personList.add(new Person("Isabell","isabell@gmail.com",Gender.FEMALE, 22));
		personList.add(new Person("Jane","jane@gmail.com",Gender.FEMALE, 24));

		/*
		 * In contrast to the allMatch() operation, the noneMatch() operation
		 * returns true if no elements in the stream match a provided predicate.
		 * In other words, it answers the question: Does no element meet this
		 * condition?
		 */
		boolean noYahooMail = personList.stream()
				.noneMatch(p -> p.getEmail().endsWith("yahoo.com"));

		System.out.println("No one uses Yahoo mail? : " + noYahooMail);
		
		
		boolean lessThan50 = personList.stream()
				.noneMatch(p -> p.getAge() < 50 );

		System.out.println("No one is less than 50? : " + lessThan50);
	}

}