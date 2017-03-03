import java.util.ArrayList;
import java.util.List;

/**
 * Sort with Lambda
 */
public class LambdaDemo
{
	public static void main(String[] args)
	{

		List<Developer> developerList = getDevelopers();

		System.out.println("-----------Before Sort-----------");
		for (Developer developer : developerList)
		{
			System.out.println(developer);
		}

		System.out.println(
				"\n-----------After Sort by Age------------");
		// lambda here...
		developerList.sort((Developer o1, Developer o2) -> o1.getAge()
															- o2.getAge());

		// java 8 only, lambda also, to print the List
		developerList.forEach(
				(developer) -> System.out.println(developer));

		System.out.println(
				"\n-----------After Sort by Name------------");
		// lambda
		developerList.sort((Developer o1, Developer o2) -> o1
									.getName().compareTo(o2.getName()));

		// java 8 only, lambda also, to print the List
		developerList.forEach(
				(developer) -> System.out.println(developer));

	}

	private static List<Developer> getDevelopers()
	{

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("Peter", 33));
		result.add(new Developer("John", 22));
		result.add(new Developer("Ram", 15));
		result.add(new Developer("Steve", 55));

		return result;

	}
}
