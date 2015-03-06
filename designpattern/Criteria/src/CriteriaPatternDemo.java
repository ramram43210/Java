import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo
{
	public static void main(String[] args)
	{
		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person("Robert", "Male", "NotMarried"));
		persons.add(new Person("John", "Male", "Married"));
		persons.add(new Person("Mike", "Male", "NotMarried"));
		persons.add(new Person("Bobby", "Male", "NotMarried"));
		persons.add(new Person("Laura", "Female", "Married"));
		persons.add(new Person("Diana", "Female", "NotMarried"));

		printPersons(persons);

		System.out.println("---------------------------------------------------------------------");

		Criteria male = new MaleCriteria();

		System.out.println("Males: ");
		printPersons(male.meetCriteria(persons));

		Criteria female = new FemaleCriteria();

		System.out.println("\nFemales: ");
		printPersons(female.meetCriteria(persons));

		Criteria notMarried = new NotMarriedCriteria();

		System.out.println("\nNotMarried: ");
		printPersons(notMarried.meetCriteria(persons));

		Criteria married = new MarriedCriteria();

		System.out.println("\nMarried: ");
		printPersons(married.meetCriteria(persons));

		Criteria marriedMale = new CriteriaAndCondition(married, male);

		System.out.println("\nMarried and Male: ");
		printPersons(marriedMale.meetCriteria(persons));

		Criteria notMarriedOrFemale = new CriteriaOrCondition(notMarried, female);

		System.out.println("\nNotMarried Or Female");
		printPersons(notMarriedOrFemale.meetCriteria(persons));
	}

	public static void printPersons(List<Person> persons)
	{
		for (Person person : persons)
		{
			System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + ", Marital Status : " + person.getMaritalStatus() + " ]");
		}
	}
}