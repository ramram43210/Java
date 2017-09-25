import java.util.ArrayList;
import java.util.List;

public class StreamAllMatchDemo
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
		 * The allMatch()operation answers the question: Do all elements in the
		 * stream meet this condition? It returns true if and only if all
		 * elements match a provided predicate, otherwise return false.
		 * 
		 * This is a short-circuiting terminal operation because the operation
		 * stops immediately if any unmatched element is found (just like
		 * short-circuit behavior of the AND operator). The following example
		 * checks if all persons are male:
		 */
		boolean areAllMale = personList.stream()
				.allMatch(p -> p.getGender().equals(Gender.MALE));
		
		System.out.println("Are all persons male? : " + areAllMale);
		
		
		boolean allUseGMail = personList.stream()
				.allMatch(p -> p.getEmail().endsWith("gmail.com"));

		System.out.println("Does everyone use GMail? : " + allUseGMail);
	}

}