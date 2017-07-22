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
		 * This will return true once a condition passed as predicate
		 * satisfy. It will not process any more elements.
		 */
		boolean matched = nameList.stream()
				.anyMatch((s) -> s.startsWith("S"));

		System.out.println(matched);
	}
}