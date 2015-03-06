import java.util.LinkedHashMap;

/*
 * Example of LinkedHashMap() Constructor.
 */
public class LinkedHashMapExample
{
	public static void main( String[] args )
	{

		/*
		 * Constructs an empty insertion-ordered LinkedHashMap instance with the
		 * default initial capacity (16) and load factor (0.75).
		 */
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

		linkedHashMap.put(1, "Apple");
		linkedHashMap.put(3, "Cat");
		linkedHashMap.put(2, "Ball");

		System.out.println("linkedHashMap : " + linkedHashMap + "\n");

	}
}
