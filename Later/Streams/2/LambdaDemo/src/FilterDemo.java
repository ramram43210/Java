import java.util.Arrays;
import java.util.List;

public class FilterDemo
{
	public static void main(String[] args)
	{
		
		List<Person> personList = Arrays.asList(new Person(1, "Ram", 25),
				new Person(2, "Peter", 31),
				new Person(3, "Steve", 25),
				new Person(3, "Balu", 32));

		FilterDemo filterDemo = new FilterDemo();
		Person person = filterDemo.getStudentByName(personList, "Peter");
		System.out.println(person);
	}

	private Person getStudentByName(List<Person> persons, String name)
	{

		Person person = null;
		for (Person tempPerson : persons)
		{
			if (name.equals(tempPerson.getName()))
			{
				person = tempPerson;
			}
		}
		return person;
	}
}