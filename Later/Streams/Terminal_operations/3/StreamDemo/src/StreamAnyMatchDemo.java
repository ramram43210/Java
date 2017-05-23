import java.util.ArrayList;
import java.util.List;

public class StreamAnyMatchDemo
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
		 * The anyMatch() operation returns true if any element in the stream
		 * matches a provided predicate. In other words, it answers the
		 * following question: Is there any element that meets this condition?
		 * 		 * 
		 * The following example checks whether the list has any female:
		 */
		boolean anyFemale = listPersons.stream()
				.anyMatch(p -> p.getGender().equals(Gender.FEMALE));

		System.out.println("Is there any female? : " + anyFemale);
		
		
		boolean anyOldPeople = listPersons.stream()
				.anyMatch(p -> p.getAge() > 60);

		System.out.println("Is there any old people ? : " + anyOldPeople);
	}

}