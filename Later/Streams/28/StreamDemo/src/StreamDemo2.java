import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Intermediate operations return the stream itself so you can chain
 * multiple method calls in a row.
 *
 */
public class StreamDemo2
{
	public static void main(String[] args)
	{
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");

		/*
		 * The intermediate operation map converts each element into
		 * another object via the given function. The following
		 * example converts each string into an upper-cased string.
		 * But you can also use map to transform each object into
		 * another type.
		 */
		memberNames.stream().filter((s) -> s.startsWith("S"))
				.map(String::toUpperCase)
				.forEach(System.out::println);
	}
}