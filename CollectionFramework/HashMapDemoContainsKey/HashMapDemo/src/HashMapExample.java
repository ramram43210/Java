import java.util.HashMap;

/*
 * Example of containsKey(Object key) method.
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
		 * Returns true if this map contains a mapping for the specified key.
		 */
		boolean isKeyExist = hashMap.containsKey(1);

		System.out.println("isKey '1' Exist : " + isKeyExist);

		isKeyExist = hashMap.containsKey(10);

		System.out.println("isKey '10' Exist : " + isKeyExist);
	}
}
