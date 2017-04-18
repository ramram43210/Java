import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * Terminal operations return a result of a certain type instead of
 * again a Stream.
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
		 * collect() method used to receive elements from a stream and
		 * store them in a collection.
		 */
		List<String> memNamesInUppercase = memberNames.stream()
				.sorted().map(String::toUpperCase)
				.collect(Collectors.toList());

		System.out.print(memNamesInUppercase);
	}
}