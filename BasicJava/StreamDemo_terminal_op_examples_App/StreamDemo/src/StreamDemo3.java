import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Terminal operations return a result of a certain type instead of
 * again a Stream.
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
		 * Various matching operations can be used to check whether a
		 * certain predicate matches the stream. All of those
		 * operations are terminal and return a boolean result.
		 */

		boolean matchedResult = nameList.stream()
										.anyMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult);

		matchedResult = nameList.stream()
								.allMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult);

		matchedResult = nameList.stream()
								.noneMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult);
	}
}