import java.util.HashMap;

/*
 * Example of HashMap() Constructor.
 */
public class HashMapExample
{
	public static void main(String[] args)
	{
		/*
		 * Constructs an empty HashMap with the default initial capacity (16)
		 * and the default load factor (0.75).
		 */
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		System.out.println("hashMap : " + hashMap + "\n");

		hashMap.put(1, "Apple");
		hashMap.put(3, "Cat");
		hashMap.put(2, "Ball");

		System.out.println("hashMap : " + hashMap);

	}
}
