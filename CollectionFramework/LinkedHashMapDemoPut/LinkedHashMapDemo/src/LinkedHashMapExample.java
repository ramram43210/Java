import java.util.LinkedHashMap;

/*
 * Example of put(K key,V value) method.
 */
public class LinkedHashMapExample
{
	public static void main( String[] args )
	{

		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

		/*
		 * Associates the specified value with the specified key in this map. If
		 * the map previously contained a mapping for the key, the old value is
		 * replaced.
		 */

		linkedHashMap.put(1, "Apple");
		linkedHashMap.put(3, "Cat");
		linkedHashMap.put(2, "Ball");

		System.out.println("linkedHashMap : " + linkedHashMap);

	}
}
