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
		 * Sorted is an intermediate operation which returns a sorted
		 * view of the stream. The elements are sorted in natural
		 * order unless you pass a custom Comparator.
		 * 
		 * Keep in mind that sorted does only create a sorted view of
		 * the stream without manipulating the ordering of the backed
		 * collection. The ordering of memberNames is untouched.
		 */
		nameList.stream().sorted().map(String::toUpperCase)
		                          .forEach(System.out::println);
	}
}