import java.util.TreeMap;

/*
 * Example of lastKey() method.
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
		treeMap.put(20, "Ball");

		System.out.println("treeMap : " + treeMap + "\n");

		/*
		 * Returns the last (highest) key currently in this map.
		 */
		Integer lastKey = treeMap.lastKey();

		System.out.println("lastKey : " + lastKey);

	}
}
