import java.util.TreeMap;

/*
 * Example of remove(Object key) method.
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
		 * Removes the mapping for this key from this TreeMap if present.
		 * 
		 * Returns: the previous value associated with key, or null if there was
		 * no mapping for key. (A null return can also indicate that the map
		 * previously associated null with key.)
		 */

		String value = treeMap.remove(3);

		System.out.println("value : " + value + "\n");
		System.out.println("treeMap : " + treeMap + "\n");

	}
}
