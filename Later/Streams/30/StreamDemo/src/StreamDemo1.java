import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Short-circuit operation - anyMatch().
 *
 */
public class StreamDemo1
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
		 * This will return true once a condition passed as predicate
		 * satisfy. It will not process any more elements.
		 */
		boolean matched = memberNames.stream()
				.anyMatch((s) -> s.startsWith("A"));

		System.out.println(matched);
	}
}