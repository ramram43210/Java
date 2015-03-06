import java.util.LinkedHashMap;
import java.util.TreeMap;

/*
 * Example of putAll(Map<? extends K,? extends V> m) method.
 */
public class LinkedHashMapExample
{
	public static void main( String[] args )
	{

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		treeMap.put(1, "Apple");
		treeMap.put(3, "Cat");
		treeMap.put(2, "Ball");

		System.out.println("treeMap : " + treeMap + "\n");

		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

		/*
		 * Copies all of the mappings from the specified map to this map. These
		 * mappings will replace any mappings that this map had for any of the
		 * keys currently in the specified map.
		 */

		linkedHashMap.putAll(treeMap);

		System.out.println("linkedHashMap : " + linkedHashMap);

	}
}
