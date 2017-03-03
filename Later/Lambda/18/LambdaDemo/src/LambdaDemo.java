import java.util.ArrayList;
import java.util.List;

/**
 * Sort with Lambda
 */
public class LambdaDemo
{
	public static void main(String[] args)
	{

		List<Developer> listDevs = getDevelopers();

		System.out.println("-----------Before Sort-----------");
		for (Developer developer : listDevs)
		{
			System.out.println(developer);
		}

		System.out.println("\n-----------After Sort------------");
		// lambda here...
		listDevs.sort((Developer o1, Developer o2) -> o1.getAge()
														- o2.getAge());

		// java 8 only, lambda also, to print the List
		listDevs.forEach(
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
