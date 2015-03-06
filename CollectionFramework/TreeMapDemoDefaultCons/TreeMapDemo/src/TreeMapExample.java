import java.util.TreeMap;

/*
 * Example of TreeMap() Constructor.
 */
public class TreeMapExample
{
	public static void main( String[] args )
	{
		/*
		 * Constructs a new, empty tree map, using the natural ordering of its
		 * keys. All keys inserted into the map must implement the Comparable
		 * interface.
		 */
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		treeMap.put(1, "Cat");
		treeMap.put(3, "Dog");
		treeMap.put(4, "Apple");
		treeMap.put(2, "Ball");
		

		System.out.println("treeMap : " + treeMap + "\n");

	}
}
