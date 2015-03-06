import java.util.Hashtable;
import java.util.Set;

/*
 * Example of keySet() method.
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
		 * Returns a Set view of the keys contained in this map. The set is
		 * backed by the map, so changes to the map are reflected in the set,
		 * and vice-versa. 
		 * 
		 * If the map is modified while an iteration over the
		 * set is in progress (except through the iterator's own remove
		 * operation), the results of the iteration are undefined. The set
		 * supports element removal, which removes the corresponding mapping
		 * from the map, via the Iterator.remove, Set.remove, removeAll,
		 * retainAll, and clear operations. It does not support the add or
		 * addAll operations.
		 */
		Set<String> set = hashtable.keySet();

		System.out.println("set : " + set + "\n");
		System.out.println("-----------------------");
		System.out.println("Key" +" | " + "value");
		System.out.println("-----------------------");

		for( String key : set )
		{
			String value = hashtable.get(key);
			System.out.println(key + "   |  " + value);
			
		}
	}
}
