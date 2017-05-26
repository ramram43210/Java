import java.util.Arrays;
import java.util.List;

public class LambdaDemo
{
	public static void main(String[] args)
	{

		List<Person> personList = Arrays.asList(
				new Person("Carla", 33), new Person("Balu", 32),
				new Person("Bharth", 40), new Person("Ajay", 31));
		
		
		System.out.println("---------- With out lambda-----------------");
		/*
		 * Before JDK 8, With out lambda
		 */
		for (Person person : personList)
		{
			System.out.println(person);
		}
		
		System.out.println("\n----------With lambda-----------------");

		/*
		 * Now JDK 8 , With lambda
		 */
		personList.forEach(person -> System.out.println(person));
		
		System.out.println("\n----------Method Reference-------------");
		
		/*
		 * Method Reference
		 */
		personList.forEach(System.out::println);
		
	}

}
