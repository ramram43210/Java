import java.util.ArrayList;
import java.util.List;

public class StreamAllMatchDemo
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
		 * The allMatch()operation answers the question: Do all elements in the
		 * stream meet this condition? It returns true if and only if all
		 * elements match a provided predicate, otherwise return false.
		 * 
		 * This is a short-circuiting terminal operation because the operation
		 * stops immediately if any unmatched element is found (just like
		 * short-circuit behavior of the AND operator). The following example
		 * checks if all persons are male:
		 */
		boolean areAllMale = listPersons.stream()
				.allMatch(p -> p.getGender().equals(Gender.MALE));
		
		System.out.println("Are all persons male? : " + areAllMale);
		
		
		boolean allUseGMail = listPersons.stream()
				.allMatch(p -> p.getEmail().endsWith("gmail.com"));

		System.out.println("Does everyone use GMail? : " + allUseGMail);
	}

}