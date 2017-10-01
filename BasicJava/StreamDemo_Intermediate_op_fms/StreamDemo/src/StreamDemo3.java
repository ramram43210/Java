import java.util.Arrays;
import java.util.List;

/**
 * Intermediate operation :sorted()
 */
public class StreamDemo3
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("Ball", "Cat", "Dog",	"Apple");

		/*
		 * sorted() operation helps sort elements based on certain
		 * criteria.
		 */
		list.stream().sorted().filter((element) -> !element.startsWith("D"))
				.map(String::toUpperCase)
				.forEach(System.out::println);
	}

}