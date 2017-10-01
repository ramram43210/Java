import java.util.Arrays;
import java.util.List;

/**
 * Intermediate operation : filter()
 */
public class StreamDemo1
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("Welcome", "apple", "to", "India");

		/*
		 * filter() operation helps eliminate elements based on certain
		 * criteria.
		 */
		list.stream().filter(element -> !"apple".equals(element))
				.forEach(element -> System.out.println(element));
	}

}