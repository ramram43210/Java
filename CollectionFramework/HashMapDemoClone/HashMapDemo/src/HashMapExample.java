import java.util.HashMap;

/*
 * Example of clone() method.
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
		 * Returns a shallow copy of this HashMap instance: the keys and values
		 * themselves are not cloned.
		 */
		Object object = hashMap.clone();

		System.out
		        .println("Object class name : " + object.getClass().getName());

		HashMap<Integer, String> clonedHashMap = (HashMap<Integer, String>) object;

		System.out.println("Cloned HashMap : " + clonedHashMap);

	}
}
