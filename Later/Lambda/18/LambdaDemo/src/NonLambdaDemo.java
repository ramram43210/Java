import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Sort without Lambda
 */
public class NonLambdaDemo
{
	public static void main(String[] args)
	{

		List<Developer> developerList = getDevelopers();

		System.out.println("-----------Before Sort-----------");
		for (Developer developer : developerList)
		{
			System.out.println(developer);
		}

		// sort by age
		Collections.sort(developerList, new Comparator<Developer>()
		{
			@Override
			public int compare(Developer o1, Developer o2)
			{
				return o1.getAge() - o2.getAge();
			}
		});

		System.out.println("\n-----------After Sort------------");
		for (Developer developer : developerList)
		{
			System.out.println(developer);
		}

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
