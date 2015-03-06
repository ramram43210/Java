import java.util.TreeMap;

/*
 * Example of put(K key,V value) method.
 */
public class TreeMapExample
{
	public static void main( String[] args )
	{

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		/*
		 * Associates the specified value with the specified key in this map. If
		 * the map previously contained a mapping for the key, the old value is
		 * replaced.
		 * 
		 * Returns: the previous value associated with key, or null if there was
		 * no mapping for key. (A null return can also indicate that the map
		 * previously associated null with key.)
		 */
		String value = treeMap.put(1, "Apple");

		System.out.println("Previous value associated with key '1' : " + value);
		System.out.println("treeMap : " + treeMap + "\n");

		value = treeMap.put(1, "Ball");

		System.out.println("Previous value associated with key '1' : " + value);
		System.out.println("treeMap : " + treeMap);

	}
}
