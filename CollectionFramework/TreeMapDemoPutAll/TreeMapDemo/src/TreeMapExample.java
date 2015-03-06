import java.util.HashMap;
import java.util.TreeMap;

/*
 * Example of putAll(Map<? extends K,? extends V> map) method.
 */
public class TreeMapExample
{
	public static void main( String[] args )
	{

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		hashMap.put(1, "Cat");
		hashMap.put(2, "Dog");
		hashMap.put(4, "Apple");
		hashMap.put(3, "Ball");

		System.out.println("hashMap : " + hashMap + "\n");

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		/*
		 * Copies all of the mappings from the specified map to this map. These
		 * mappings replace any mappings that this map had for any of the keys
		 * currently in the specified map.
		 */
		treeMap.putAll(hashMap);

		System.out.println("treeMap : " + treeMap + "\n");

	}
}
