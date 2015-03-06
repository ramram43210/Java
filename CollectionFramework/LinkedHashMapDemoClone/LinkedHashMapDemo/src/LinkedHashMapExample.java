import java.util.LinkedHashMap;

/*
 * Example of clone() method.
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
		 * Returns a shallow copy of this linkedHashMap instance: the keys and values
		 * themselves are not cloned.
		 */
		Object object = linkedHashMap.clone();

		System.out
		        .println("Object class name : " + object.getClass().getName());

		LinkedHashMap<Integer, String> clonedLinkedHashMap = (LinkedHashMap<Integer, String>) object;

		System.out.println("cloned LinkedHashMap : " + clonedLinkedHashMap);

	}
}
