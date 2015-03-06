import java.util.HashMap;

/*
 * Example of containsValue(Object value) method.
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
		 * Returns true if this map maps one or more keys to the specified
		 * value.
		 */
		boolean isValueExist = hashMap.containsValue("Ball");

		System.out.println("isValue 'Ball' Exist : " + isValueExist);

		isValueExist = hashMap.containsValue("Dog");

		System.out.println("isValue 'Dog' Exist : " + isValueExist);
	}
}
