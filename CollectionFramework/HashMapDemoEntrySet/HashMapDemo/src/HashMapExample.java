import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Example of entrySet() method.
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
		 * A map entry (key-value pair).
		 * 
		 * Returns a Set view of the mappings contained in this map.
		 */
		Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();

		System.out.println("entrySet : " + entrySet + "\n");

		System.out.println("-----------------------");
		System.out.println("Key" +" | " + "value");
		System.out.println("-----------------------");
		
		for( Map.Entry<Integer, String> entry : entrySet )
		{
			System.out.println(entry.getKey() + "   | " +entry.getValue());
		}

	}
}
