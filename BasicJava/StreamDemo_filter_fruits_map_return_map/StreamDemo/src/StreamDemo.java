import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * Example to filter a Map and return a map.
 */
public class StreamDemo
{
	public static void main(String[] args)
	{

		Map<Integer, String> fruitsMap = new HashMap<>();
		fruitsMap.put(1, "Apple");
		fruitsMap.put(2, "Orange");
		fruitsMap.put(3, "Banana");

		 //Map -> Stream -> Filter -> Map
        Map<Integer, String> filteredMap = fruitsMap.entrySet().stream()
                .filter(map -> map.getKey() == 2)
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));

        System.out.println(filteredMap);

	}

}