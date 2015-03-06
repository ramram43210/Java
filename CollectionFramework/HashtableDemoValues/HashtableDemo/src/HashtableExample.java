import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;

/*
 * Example of values() method.
 */
public class HashtableExample
{
	public static void main( String[] args )
	{

		Hashtable<String, String> hashtable = new Hashtable<String, String>();

		/*
		 * Key = CountryCode,Value = CountryName.
		 */
		hashtable.put("AF", "AFGHANISTAN");
		hashtable.put("BE", "BELGIUM");
		hashtable.put("US", "UNITED STATES");
		hashtable.put("IN", "INDIA");

		System.out.println("hashtable : " + hashtable + "\n");

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
		Collection<String> collection = hashtable.values();

		System.out.println("collection : " + collection + "\n");

		for( Iterator<String> iterator = collection.iterator(); iterator
		        .hasNext(); )
		{
			String value = iterator.next();
			System.out.println(value);
		}
	}
}
