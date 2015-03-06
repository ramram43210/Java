import java.util.HashMap;
import java.util.TreeMap;

/*
 * Example of putAll(Map<? extends K,? extends V> m) method.
 */
public class HashMapExample
{
	public static void main( String[] args )
	{

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		treeMap.put(1, "Apple");
		treeMap.put(2, "Ball");
		treeMap.put(3, "Cat");

		System.out.println("treeMap : " + treeMap + "\n");

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		/*
		 * Copies all of the mappings from the specified map to this map. These
		 * mappings will replace any mappings that this map had for any of the
		 * keys currently in the specified map.
		 */
		hashMap.putAll(treeMap);

		System.out.println("hashMap : " + hashMap);

	}
}
