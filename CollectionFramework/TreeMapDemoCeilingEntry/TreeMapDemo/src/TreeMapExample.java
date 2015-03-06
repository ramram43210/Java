import java.util.Map;
import java.util.TreeMap;

/*
 * Example of ceilingEntry(K key) method.
 */
public class TreeMapExample
{
	public static void main(String[] args)
	{

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		treeMap.put(10, "Cat");
		treeMap.put(50, "Dog");
		treeMap.put(30, "Apple");
		treeMap.put(40, "Ball");
		treeMap.put(20, "Eagle");

		System.out.println("treeMap : " + treeMap + "\n");

		/*
		 * Returns a key-value mapping associated with the least key greater
		 * than or equal to the given key, or null if there is no such key.
		 */
		Map.Entry<Integer, String> entry = treeMap.ceilingEntry(15);

		System.out.println("ceilingEntry(15) : " + entry);

		entry = treeMap.ceilingEntry(30);

		System.out.println("ceilingEntry(30) : " + entry);

		entry = treeMap.ceilingEntry(200);

		System.out.println("ceilingEntry(200) : " + entry);

	}
}
