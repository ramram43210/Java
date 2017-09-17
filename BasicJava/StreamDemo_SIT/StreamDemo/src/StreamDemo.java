import java.util.Arrays;
import java.util.Collection;

public class StreamDemo
{
	public static void main(String[] args)
	{
		Collection<String> nameList = Arrays.asList("Peter", "John", "Ram");

		/*
		 * Following code prints strings greater than length 5 by iterating a
		 * collection.
		 */
		nameList.stream().filter(name -> name.length() > 3)
				.forEach(name -> System.out.println(name));
	}

}