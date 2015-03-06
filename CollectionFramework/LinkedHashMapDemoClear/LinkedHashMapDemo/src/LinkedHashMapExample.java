import java.util.LinkedHashMap;

/*
 * Example of clear() method.
 */
public class LinkedHashMapExample
{
	public static void main( String[] args )
	{

		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

		linkedHashMap.put(1, "Apple");
		linkedHashMap.put(3, "Cat");
		linkedHashMap.put(2, "Ball");

		System.out.println("linkedHashMap : " + linkedHashMap + "\n");

		/*
		 * Removes all of the mappings from this map. The map will be empty
		 * after this call returns.
		 */
		linkedHashMap.clear();

		System.out.println("linkedHashMap : " + linkedHashMap + "\n");

	}
}
