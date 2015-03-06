import java.util.HashMap;

/*
 * Example of size() method.
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
		 * Returns the number of key-value mappings in this map.
		 */
		int size = hashMap.size();

		System.out.println("size : " + size);

	}
}
