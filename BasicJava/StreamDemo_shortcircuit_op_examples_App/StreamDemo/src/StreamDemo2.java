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
		 * It will return first element from stream and then will not
		 * process any more element.
		 */

		String firstMatchedName = nameList.stream()
				.filter((s) -> s.startsWith("S")).findFirst().get();

		System.out.println(firstMatchedName);
	}
}