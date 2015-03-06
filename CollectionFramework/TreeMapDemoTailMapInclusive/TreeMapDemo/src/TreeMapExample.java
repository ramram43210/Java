import java.util.SortedMap;
import java.util.TreeMap;

/*
 * Example of tailMap(K fromKey, boolean inclusive) method.
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
		 * Returns a view of the portion of this map whose keys are greater than
		 * (or equal to, if inclusive is true) fromKey. The returned map is
		 * backed by this map, so changes in the returned map are reflected in
		 * this map, and vice-versa. The returned map supports all optional map
		 * operations that this map supports.
		 */
		SortedMap<Integer, String> sortedMap = treeMap.tailMap(20, false);

		System.out.println("sortedMap [inclusive is false] : " + sortedMap
				+ "\n");

		sortedMap = treeMap.tailMap(20, true);

		System.out.println("sortedMap [inclusive is true] : " + sortedMap);

	}
}
