import java.util.Set;
import java.util.TreeMap;

/*
 * Example of keySet() method.
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
		 * Returns a Set view of the keys contained in this map. The set is
		 * backed by the map, so changes to the map are reflected in the set,
		 * and vice-versa.
		 * 
		 * If the map is modified while an iteration over the set is in progress
		 * (except through the iterator's own remove operation), the results of
		 * the iteration are undefined. The set supports element removal, which
		 * removes the corresponding mapping from the map, via the
		 * Iterator.remove, Set.remove, removeAll, retainAll, and clear
		 * operations. It does not support the add or addAll operations.
		 */
		Set<Integer> set = treeMap.keySet();

		System.out.println("set : " + set + "\n");

		System.out.println("-----------------------");
		System.out.println("Key" + " | " + "value");
		System.out.println("-----------------------");

		for( Integer key : set )
		{
			String value = treeMap.get(key);
			System.out.println(key + "   |  " + value);

		}

	}
}
