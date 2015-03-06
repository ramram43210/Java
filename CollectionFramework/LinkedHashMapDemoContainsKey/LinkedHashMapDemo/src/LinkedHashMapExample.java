import java.util.LinkedHashMap;

/*
 * Example of containsKey(Object key) method.
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
		 * Returns true if this map contains a mapping for the specified key.
		 */
		boolean isKeyExist = linkedHashMap.containsKey(1);

		System.out.println("isKey '1' Exist : " + isKeyExist);

		isKeyExist = linkedHashMap.containsKey(10);

		System.out.println("isKey '10' Exist : " + isKeyExist);

	}
}
