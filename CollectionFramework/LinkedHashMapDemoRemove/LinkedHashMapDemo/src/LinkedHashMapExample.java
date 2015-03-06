import java.util.LinkedHashMap;

/*
 * Example of remove(Object key) method.
 */
public class LinkedHashMapExample
{
	public static void main( String[] args )
	{

		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

		linkedHashMap.put(1, "Apple");
		linkedHashMap.put(3, "Cat");
		linkedHashMap.put(2, "Ball");

		System.out.println("linkedHashMap : " + linkedHashMap);


		/*
		 * Removes the mapping for the specified key from this map if present.
		 * 
		 * Returns the previous value associated with key, or null if there was
		 * no mapping for key. (A null return can also indicate that the map
		 * previously associated null with key.)
		 */
		
		String value = linkedHashMap.remove(1);

		System.out.println("\nvalue : " + value );
		System.out.println("linkedHashMap : " + linkedHashMap + "\n");

	}
}
