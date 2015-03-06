import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/*
 * Example of subMap(K fromKey,K toKey) method.
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
		 * Returns a view of the portion of this map whose keys range from
		 * fromKey, inclusive, to toKey, exclusive. (If fromKey and toKey are
		 * equal, the returned map is empty.) The returned map is backed by this
		 * map, so changes in the returned map are reflected in this map, and
		 * vice-versa. The returned map supports all optional map operations
		 * that this map supports.
		 * 
		 * Equivalent to subMap(fromKey, true, toKey, false).
		 */
		SortedMap<Integer, String> sortedMap = treeMap.subMap(10, 40);

		System.out.println("sortedMap : " + sortedMap + "\n");
		
		Set<Integer> set = sortedMap.keySet();

		System.out.println("set : " + set + "\n");

		System.out.println("-----------------------");
		System.out.println("Key" + " | " + "value");
		System.out.println("-----------------------");

		for( Integer key : set )
		{
			String value = sortedMap.get(key);
			System.out.println(key + "   |  " + value);
		}

	}
}
