import java.util.LinkedHashMap;
import java.util.TreeMap;

/*
 * Example of LinkedHashMap(Map<? extends K,? extends V> m) Constructor.
 */
public class LinkedHashMapExample
{
	public static void main( String[] args )
	{

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		treeMap.put(1, "Apple");
		treeMap.put(3, "Cat");
		treeMap.put(2, "Ball");

		System.out.println("treeMap : " + treeMap+"\n");

		/*
		 * Constructs an insertion-ordered LinkedHashMap instance with the same
		 * mappings as the specified map. The LinkedHashMap instance is created
		 * with a default load factor (0.75) and an initial capacity sufficient
		 * to hold the mappings in the specified map.
		 */

		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>(
		        treeMap);

		System.out.println("linkedHashMap : " + linkedHashMap);

	}
}
