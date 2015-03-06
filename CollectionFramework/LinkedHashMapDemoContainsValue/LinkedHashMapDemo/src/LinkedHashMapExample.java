import java.util.LinkedHashMap;

/*
 * Example of containsValue(Object value) method.
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
		 * Returns true if this map maps one or more keys to the specified
		 * value.
		 */
		boolean isValueExist = linkedHashMap.containsValue("Ball");

		System.out.println("isValue 'Ball' Exist : " + isValueExist);

		isValueExist = linkedHashMap.containsValue("Dog");

		System.out.println("isValue 'Dog' Exist : " + isValueExist);

	}
}
