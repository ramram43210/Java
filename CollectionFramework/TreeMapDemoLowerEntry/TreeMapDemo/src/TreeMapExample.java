import java.util.Map;
import java.util.TreeMap;

/*
 * Example of lowerEntry(K key) method.
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
		 * Returns a key-value mapping associated with the greatest key strictly
		 * less than the given key, or null if there is no such key.
		 */
		Map.Entry<Integer, String> entry = treeMap.lowerEntry(35);

		System.out.println("lowerEntry(35) : " + entry);
		
		entry = treeMap.lowerEntry(50);

		System.out.println("lowerEntry(50) : " + entry);
		
		entry = treeMap.lowerEntry(10);

		System.out.println("lowerEntry(10) : " + entry);

	}
}
