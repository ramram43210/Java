import java.util.NavigableSet;
import java.util.TreeMap;

/*
 * Example of descendingKeySet() method.
 */
public class TreeMapExample
{
	public static void main( String[] args )
	{

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		treeMap.put(10, "Cat");
		treeMap.put(40, "Dog");
		treeMap.put(30, "Apple");
		treeMap.put(20, "Ball");
		

		System.out.println("treeMap : " + treeMap + "\n");

		/*
		 * Returns a reverse order NavigableSet view of the keys contained in
		 * this map. The set's iterator returns the keys in descending order.
		 * The set is backed by the map, so changes to the map are reflected in
		 * the set, and vice-versa.
		 * 
		 * If the map is modified while an iteration over the set is in progress
		 * (except through the iterator's own remove operation), the results of
		 * the iteration are undefined. The set supports element removal, which
		 * removes the corresponding mapping from the map, via the
		 * Iterator.remove, Set.remove, removeAll, retainAll, and clear
		 * operations. It does not support the add or addAll operations.
		 */
		NavigableSet<Integer> navigableSet = treeMap.descendingKeySet();

		System.out.println("navigableSet : " + navigableSet + "\n");

		for( Integer key : navigableSet )
		{
			System.out.println(key);
		}

	}
}
