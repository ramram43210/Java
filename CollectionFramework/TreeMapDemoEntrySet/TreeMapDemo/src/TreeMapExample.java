import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * Example of entrySet() method.
 */
public class TreeMapExample
{
	public static void main( String[] args )
	{

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		treeMap.put(1, "Cat");
		treeMap.put(2, "Dog");
		treeMap.put(4, "Apple");
		treeMap.put(3, "Ball");

		System.out.println("treeMap : " + treeMap + "\n");

		/*
		 * A map entry (key-value pair).
		 * 
		 * Returns a Set view of the mappings contained in this map.
		 */
		Set<Map.Entry<Integer, String>> entrySet = treeMap.entrySet();

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
