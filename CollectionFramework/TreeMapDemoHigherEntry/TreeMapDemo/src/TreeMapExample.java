import java.util.Map;
import java.util.TreeMap;

/*
 * Example of higherEntry(K key) method.
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
		 * Returns a key-value mapping associated with the least key strictly
		 * greater than the given key, or null if there is no such key.
		 */
		Map.Entry<Integer, String> entry = treeMap.higherEntry(35);

		System.out.println("higherEntry(35) : " + entry);

		entry = treeMap.higherEntry(20);

		System.out.println("higherEntry(20) : " + entry);

		entry = treeMap.higherEntry(200);

		System.out.println("higherEntry(200) : " + entry);

	}
}
