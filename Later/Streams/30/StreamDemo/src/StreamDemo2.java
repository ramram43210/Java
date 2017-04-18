import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Short-circuit operation - findFirst().
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
		 * It will return first element from stream and then will not
		 * process any more element.
		 */

		String firstMatchedName = memberNames.stream()
				.filter((s) -> s.startsWith("S")).findFirst().get();

		System.out.println(firstMatchedName);
	}
}