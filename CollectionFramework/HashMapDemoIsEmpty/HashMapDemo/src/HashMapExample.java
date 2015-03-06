import java.util.HashMap;

/*
 * Example of isEmpty() method.
 */
public class HashMapExample
{
	public static void main( String[] args )
	{

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		System.out.println("hashMap : " + hashMap );

		/*
		 * Returns true if this map contains no key-value mappings.
		 */
		boolean isEmpty = hashMap.isEmpty();

		System.out.println("isEmpty : " + isEmpty + "\n");

		hashMap.put(1, "Apple");
		hashMap.put(2, "Ball");
		hashMap.put(3, "Cat");

		System.out.println("hashMap : " + hashMap );

		isEmpty = hashMap.isEmpty();

		System.out.println("isEmpty : " + isEmpty);

	}
}
