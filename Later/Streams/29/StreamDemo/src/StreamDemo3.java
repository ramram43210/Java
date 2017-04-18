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
		 * Various matching operations can be used to check whether a
		 * certain predicate matches the stream. All of those
		 * operations are terminal and return a boolean result.
		 */

		boolean matchedResult = memberNames.stream()
				.anyMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult);

		matchedResult = memberNames.stream()
				.allMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult);

		matchedResult = memberNames.stream()
				.noneMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult);
	}
}