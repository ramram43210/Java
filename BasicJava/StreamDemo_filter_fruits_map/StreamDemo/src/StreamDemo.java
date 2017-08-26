import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 
 * Example to filter a Map and return a value.
 */
public class StreamDemo
{
	public static void main(String[] args)
	{

		Map<Integer, String> fruitsMap = new HashMap<>();
		fruitsMap.put(1, "Apple");
		fruitsMap.put(2, "Orange");
		fruitsMap.put(3, "Banana");

		String result = "";
		for (Map.Entry<Integer, String> entry : fruitsMap.entrySet())
		{
			if (2 == entry.getKey())
			{
				result = entry.getValue();
			}
		}
		System.out.println("Before Java 8 : " + result);

		// Map -> Stream -> Filter -> String
		result = fruitsMap.entrySet().stream()
				.filter(map -> 2 == map.getKey())
				.map(map -> map.getValue())
				.collect(Collectors.joining());

		System.out.println("With Java 8 : " + result);

	}

}