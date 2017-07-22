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
		List<String> nameList = new ArrayList<>();
		nameList.add("Amitabh");
		nameList.add("Shekhar");
		nameList.add("Aman");
		nameList.add("Rahul");
		nameList.add("Shahrukh");
		nameList.add("Salman");
		nameList.add("Yana");
		nameList.add("Lokesh");

		/*
		 * Filter accepts a predicate to filter all elements of the
		 * stream. This operation is intermediate which enables us to
		 * call another stream operation (e.g. forEach) on the result.
		 */
		nameList.stream().filter((s) -> s.startsWith("A"))
							.forEach(System.out::println);
	}
}