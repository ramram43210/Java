import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Intermediate operations return the stream itself so you can chain
 * multiple method calls in a row.
 *
 */
public class StreamDemo3
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
		 * Sorted is an intermediate operation which returns a sorted
		 * view of the stream. The elements are sorted in natural
		 * order unless you pass a custom Comparator.
		 * 
		 * Keep in mind that sorted does only create a sorted view of
		 * the stream without manipulating the ordering of the backed
		 * collection. The ordering of memberNames is untouched.
		 */
		memberNames.stream().sorted().map(String::toUpperCase)
				.forEach(System.out::println);
	}
}