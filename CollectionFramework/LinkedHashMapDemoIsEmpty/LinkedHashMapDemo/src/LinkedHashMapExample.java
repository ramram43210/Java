import java.util.LinkedHashMap;

/*
 * Example of isEmpty() method.
 */
public class LinkedHashMapExample
{
	public static void main( String[] args )
	{

		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		

		System.out.println("linkedHashMap : " + linkedHashMap );

		/*
		 * Returns true if this map contains no key-value mappings.
		 */
		boolean isEmpty = linkedHashMap.isEmpty();

		System.out.println("isEmpty : " + isEmpty + "\n");

		linkedHashMap.put(1, "Apple");
		linkedHashMap.put(3, "Cat");
		linkedHashMap.put(2, "Ball");

		System.out.println("linkedHashMap : " + linkedHashMap);

		isEmpty = linkedHashMap.isEmpty();

		System.out.println("isEmpty : " + isEmpty);

	}
}
