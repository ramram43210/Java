import java.util.Arrays;
import java.util.List;

/**
 * Intermediate operation : map()
 */
public class StreamDemo2
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("Welcome", "apple", "to","India");

		/*
		 * map() operation helps map elements to the corresponding
		 * results.
		 */
		list.stream().filter(element -> !"apple".equals(element))
				.map(String::toUpperCase)
				.forEach(System.out::println);
	}

}