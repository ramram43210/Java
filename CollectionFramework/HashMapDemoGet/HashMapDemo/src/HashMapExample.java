import java.util.HashMap;

/*
 * Example of get(Object key) method.
 */
public class HashMapExample
{
	public static void main( String[] args )
	{

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		hashMap.put(1, "Apple");
		hashMap.put(2, "Ball");
		hashMap.put(3, "Cat");

		System.out.println("hashMap : " + hashMap + "\n");

		/*
		 * Returns the value to which the specified key is mapped, or null if
		 * this map contains no mapping for the key.
		 * 
		 * A return value of null does not necessarily indicate that the map
		 * contains no mapping for the key; it's also possible that the map
		 * explicitly maps the key to null. The containsKey operation may be
		 * used to distinguish these two cases.
		 */
		String value = hashMap.get(2);

		System.out.println("value for the Key '2' : " + value);

		value = hashMap.get(10);

		System.out.println("value for the Key '10' : " + value);

	}
}
