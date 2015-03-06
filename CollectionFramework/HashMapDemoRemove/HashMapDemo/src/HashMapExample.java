import java.util.HashMap;

/*
 * Example of remove(Object key) method.
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
		 * Removes the mapping for the specified key from this map if present.
		 * 
		 * Returns the previous value associated with key, or null if there was
		 * no mapping for key. (A null return can also indicate that the map
		 * previously associated null with key.)
		 */
		
		String value = hashMap.remove(2);

		System.out.println("value : " + value);
		System.out.println("hashMap : " + hashMap);

	}
}
