import java.util.Arrays;
import java.util.List;

/**
 * 
 * Before JDK8 How to filter the personList?
 *
 */
public class FilterDemo
{
	public static void main(String[] args)
	{

		List<Person> personList = Arrays.asList(new Person(1, "Ram", 25),
				new Person(2, "Peter", 31), new Person(3, "Steve", 25),
				new Person(4, "Balu", 32));

		FilterDemo filterDemo = new FilterDemo();
		Person person = filterDemo.getStudentByName(personList, "Peter");
		System.out.println(person);
	}

	private Person getStudentByName(List<Person> personList, String name)
	{

		Person tempPerson = null;
		for (Person person : personList)
		{
			if (name.equals(person.getName()))
			{
				tempPerson = person;
			}
		}
		return tempPerson;
	}
}