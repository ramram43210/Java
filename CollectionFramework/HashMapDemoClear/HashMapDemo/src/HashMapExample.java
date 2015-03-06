import java.util.HashMap;

/*
 * Example of clear() method.
 */
public class HashMapExample
{
	public static void main(String[] args)
	{

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		hashMap.put(1, "Apple");
		hashMap.put(3, "Cat");
		hashMap.put(2, "Ball");

		System.out.println("hashMap : " + hashMap + "\n");

		/*
		 * Removes all of the mappings from this map. The map will be empty
		 * after this call returns.
		 */
		hashMap.clear();

		System.out.println("hashMap : " + hashMap);

	}
}
