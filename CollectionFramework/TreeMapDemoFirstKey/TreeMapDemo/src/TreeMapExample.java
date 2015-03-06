import java.util.TreeMap;

/*
 * Example of firstKey() method.
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
		 * Returns the first (lowest) key currently in this map.
		 */
		Integer firstKey = treeMap.firstKey();

		System.out.println("firstKey : " + firstKey);

	}
}
