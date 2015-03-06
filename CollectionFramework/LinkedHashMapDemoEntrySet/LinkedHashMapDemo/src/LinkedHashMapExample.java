import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
 * Example of entrySet() method.
 */
public class LinkedHashMapExample
{
	public static void main(String[] args)
	{

		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

		linkedHashMap.put(1, "Apple");
		linkedHashMap.put(3, "Cat");
		linkedHashMap.put(2, "Ball");

		System.out.println("linkedHashMap : " + linkedHashMap + "\n");

		/*
		 * A map entry (key-value pair).
		 * 
		 * Returns a Set view of the mappings contained in this map.
		 */
		Set<Map.Entry<Integer, String>> entrySet = linkedHashMap.entrySet();

		System.out.println("entrySet : " + entrySet + "\n");

		System.out.println("-----------------------");
		System.out.println("Key" + " | " + "value");
		System.out.println("-----------------------");

		for (Map.Entry<Integer, String> entry : entrySet)
		{
			System.out.println(entry.getKey() + "   | " + entry.getValue());
		}

	}
}
