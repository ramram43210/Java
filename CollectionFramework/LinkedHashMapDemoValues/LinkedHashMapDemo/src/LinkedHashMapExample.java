import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

/*
 * Example of values() method.
 */
public class LinkedHashMapExample
{
	public static void main( String[] args )
	{

		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

		linkedHashMap.put(1, "Apple");
		linkedHashMap.put(3, "Cat");
		linkedHashMap.put(2, "Ball");

		System.out.println("LinkedHashMap : " + linkedHashMap + "\n");

		/*
		 * Returns a Collection view of the values contained in this map. The
		 * collection is backed by the map, so changes to the map are reflected
		 * in the collection, and vice-versa.
		 * 
		 * If the map is modified while an iteration over the collection is in
		 * progress (except through the iterator's own remove operation), the
		 * results of the iteration are undefined. The collection supports
		 * element removal, which removes the corresponding mapping from the
		 * map, via the Iterator.remove, Collection.remove, removeAll, retainAll
		 * and clear operations. It does not support the add or addAll
		 * operations.
		 */
		Collection<String> collection = linkedHashMap.values();

		System.out.println("collection : " + collection + "\n");

		for( Iterator<String> iterator = collection.iterator(); iterator
		        .hasNext(); )
		{
			String value = iterator.next();
			System.out.println(value);
		}
	}
}
