import java.util.LinkedHashMap;

/*
 * Example of get(Object key) method.
 */
public class LinkedHashMapExample
{
	public static void main( String[] args )
	{

		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

		linkedHashMap.put(1, "Apple");
		linkedHashMap.put(3, "Cat");
		linkedHashMap.put(2, "Ball");

		System.out.println("linkedHashMap : " + linkedHashMap+"\n");

		/*
		 * Returns the value to which the specified key is mapped, or null if
		 * this map contains no mapping for the key.
		 * 
		 * A return value of null does not necessarily indicate that the map
		 * contains no mapping for the key; it's also possible that the map
		 * explicitly maps the key to null. The containsKey operation may be
		 * used to distinguish these two cases.
		 */
		String value = linkedHashMap.get(2);

		System.out.println("value for the Key '2' : " + value);

		value = linkedHashMap.get(10);

		System.out.println("value for the Key '10' : " + value);

	}
}
