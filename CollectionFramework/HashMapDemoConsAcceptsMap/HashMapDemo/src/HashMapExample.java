import java.util.HashMap;
import java.util.TreeMap;

/*
 * Example of HashMap(Map<? extends K,? extends V> m) constructor.
 */
public class HashMapExample
{
	public static void main( String[] args )
	{

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		treeMap.put(1, "Apple");
		treeMap.put(2, "Ball");
		treeMap.put(3, "Cat");

		System.out.println("treeMap : " + treeMap+"\n");

		/*
		 * Constructs a new HashMap with the same mappings as the specified Map.
		 * The HashMap is created with default load factor (0.75) and an initial
		 * capacity sufficient to hold the mappings in the specified Map.
		 */

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>(treeMap);

		System.out.println("hashMap : " + hashMap);

	}
}
