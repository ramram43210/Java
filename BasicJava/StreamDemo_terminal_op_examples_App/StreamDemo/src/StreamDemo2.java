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
		 * collect() method used to receive elements from a stream and
		 * store them in a collection.
		 */
		List<String> upperCaseNameList = nameList.stream()
				        						 .sorted()
				        						 .map(String::toUpperCase)
				        						 .collect(Collectors.toList());

		System.out.print(upperCaseNameList);
	}
}