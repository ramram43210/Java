import java.util.stream.Stream;

public class StreamForEachDemo
{
	public static void main(String[] args)
	{
		Object[] objects = Stream.of(1, 2, 3, 4, 5).toArray();
		for (Object object : objects)
		{
			System.out.println(object);
		}
		
		System.out.println("-----------------------------------");
		
		String[] upstringNameArray = (String[]) Stream
				.of("Peter", "Juli", "Ram")
				.map(s -> s.toUpperCase()).toArray(String[]::new);
		
		for (String name : upstringNameArray)
		{
			System.out.println(name);
		}

	}
}