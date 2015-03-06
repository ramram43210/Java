import java.util.Map;
import java.util.TreeMap;

/*
 * Example of pollFirstEntry() method.
 */
public class TreeMapExample
{
	public static void main( String[] args )
	{

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		treeMap.put(10, "Cat");
		treeMap.put(50, "Dog");
		treeMap.put(30, "Apple");
		treeMap.put(40, "Ball");
		treeMap.put(20, "Eagle");

		System.out.println("treeMap : " + treeMap + "\n");

		/*
		 * Removes and returns a key-value mapping associated with the least key
		 * in this map, or null if the map is empty.
		 */
		Map.Entry<Integer, String> entry = treeMap.pollFirstEntry();

		System.out.println("entry : " + entry);

		System.out.println("key : " + entry.getKey() + ","
		        + "Value : " + entry.getValue() + "\n");

		System.out.println("treeMap : " + treeMap );

	}
}
