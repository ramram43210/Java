import java.util.HashMap;

/*
 * Example of put(K key,V value) method.
 */
public class HashMapExample
{
	public static void main( String[] args )
	{

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		/*
		 * Associates the specified value with the specified key in this map. If
		 * the map previously contained a mapping for the key, the old value is
		 * replaced.
		 */
		hashMap.put(1, "Apple");
		hashMap.put(3, "Cat");
		hashMap.put(2, "Ball");
		
		System.out.println("hashMap : "+hashMap);

	}
}
