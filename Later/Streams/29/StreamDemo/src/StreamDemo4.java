import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Terminal operations return a result of a certain type instead of
 * again a Stream.
 *
 */
public class StreamDemo4
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
		 * Count is a terminal operation returning the number of
		 * elements in the stream as a long.
		 */

		long totalMatched = memberNames.stream()
				.filter((s) -> s.startsWith("A")).count();

		System.out.println(totalMatched);
	}
}