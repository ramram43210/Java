import java.util.ArrayList;
import java.util.List;

public class StreamNoneMatchDemo
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
		 * In contrast to the allMatch() operation, the noneMatch() operation
		 * returns true if no elements in the stream match a provided predicate.
		 * In other words, it answers the question: Does no element meet this
		 * condition?
		 * 
		 * The following example checks whether the list has any female:
		 */
		boolean noYahooMail = listPersons.stream()
				.noneMatch(p -> p.getEmail().endsWith("yahoo.com"));

		System.out.println("No one uses Yahoo mail? : " + noYahooMail);
		
		
		boolean lessThan50 = listPersons.stream()
				.noneMatch(p -> p.getAge() < 50 );

		System.out.println("No one is less than 50? : " + lessThan50);
	}

}