import java.util.Map;
import java.util.TreeMap;

/*
 * Example of floorEntry(K key) method.
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
		 * Returns a key-value mapping associated with the greatest key less
		 * than or equal to the given key, or null if there is no such key.
		 */
		Map.Entry<Integer, String> entry = treeMap.floorEntry(35);

		System.out.println("floorEntry(35) : " + entry);

		entry = treeMap.floorEntry(20);

		System.out.println("floorEntry(20) : " + entry);

		entry = treeMap.floorEntry(5);

		System.out.println("floorEntry(5) : " + entry);

	}
}
