import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Intermediate operations return the stream itself so you can chain
 * multiple method calls in a row.
 *
 */
public class StreamDemo1
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
		 * Filter accepts a predicate to filter all elements of the
		 * stream. This operation is intermediate which enables us to
		 * call another stream operation (e.g. forEach) on the result.
		 */
		memberNames.stream().filter((s) -> s.startsWith("A"))
				.forEach(System.out::println);
	}
}