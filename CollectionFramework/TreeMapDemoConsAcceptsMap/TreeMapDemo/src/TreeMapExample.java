import java.util.HashMap;
import java.util.TreeMap;

/*
 * Example of TreeMap(Map<? extends K,? extends V> m) Constructor.
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

		/*
		 * Constructs a new tree map containing the same mappings as the given
		 * map, ordered according to the natural ordering of its keys. All keys
		 * inserted into the new map must implement the Comparable interface.
		 */

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(hashMap);
		
		System.out.println("treeMap : " + treeMap + "\n");

	}
}
