import java.util.stream.Stream;

public class StreamToArrayDemo
{
	public static void main(String[] args)
	{

		Object[] objectArray = Stream.of(1, 2, 3, 4, 5).toArray();
		
		for (Object object : objectArray)
		{
			System.out.println(object);
		}

		System.out.println("-----------------------------------");

		String[] upperCaseNameArray = (String[]) Stream.of("Peter", "Juli", "Ram")
				                                       .map(s -> s.toUpperCase())
				                                       .toArray(String[]::new);

		for (String name : upperCaseNameArray)
		{
			System.out.println(name);
		}

	}
}