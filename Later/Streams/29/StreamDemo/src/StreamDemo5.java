import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 
 * Terminal operations return a result of a certain type instead of
 * again a Stream.
 *
 */
public class StreamDemo5
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
		 * reduce() terminal operation performs a reduction on the
		 * elements of the stream with the given function. The result
		 * is an Optional holding the reduced value.
		 */

		Optional<String> reduced = memberNames.stream()
				.reduce((s1, s2) -> s1 + "#" + s2);

		reduced.ifPresent(System.out::println);
	}
}