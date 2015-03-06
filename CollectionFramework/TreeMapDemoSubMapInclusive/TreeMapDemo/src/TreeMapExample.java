import java.util.NavigableMap;
import java.util.TreeMap;

/*
 * Example of subMap(K fromKey,
                     boolean fromInclusive,
                     K toKey,
                     boolean toInclusive) method.
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
		 * fromKey to toKey. If fromKey and toKey are equal, the returned map is
		 * empty unless fromInclusive and toInclusive are both true. The
		 * returned map is backed by this map, so changes in the returned map
		 * are reflected in this map, and vice-versa. The returned map supports
		 * all optional map operations that this map supports.
		 */
		NavigableMap<Integer, String> navigableMap = treeMap.subMap(10, false,
		        40, false);

		System.out
		        .println("navigableMap [fromInclusive and toInclusive are both false] : "
		                + navigableMap + "\n");
		
		navigableMap = treeMap.subMap(10, true,
		        40, true);

		System.out
		        .println("navigableMap [fromInclusive and toInclusive are both true] : "
		                + navigableMap + "\n");

	}
}
