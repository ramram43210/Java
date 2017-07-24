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
		 * reduce() terminal operation performs a reduction on the
		 * elements of the stream with the given function. The result
		 * is an Optional holding the reduced value.
		 */

		Optional<String> optional = nameList.stream()
											.reduce((s1, s2) -> s1 + "#" + s2);

		optional.ifPresent(System.out::println);
	}
}