import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 Method: 

 public static <T> Set<T> singleton(T o)

 Parameters:
 o - the sole object to be stored in the returned set.

 Returns:

 an immutable set containing only the specified object.

 ---------------------------------------------------------------

 Method: 

 public static <T> List<T> singletonList(T o)

 Parameters:

 o - the sole object to be stored in the returned list.

 Returns:

 an immutable list containing only the specified object.

 ----------------------------------------------------------------

 Method: 

 public static <K,V> Map<K,V> singletonMap(K key,
 V value)

 Parameters:

 key - the sole key to be stored in the returned map.
 value - the value to which the returned map maps key.

 Returns:

 an immutable map containing only the specified key-value mapping.

 */

public class CollectionsExample
{

	public static void main(String[] args)
	{

		/*
		 * Returns an immutable set containing only the specified object.
		 */
		Set<String> singleTonSet = Collections.singleton("Dave");

		System.out.println("singleTonSet : " + singleTonSet + "\n");

		/*
		 * We cannot add or modify the immutable set.
		 */

		// singleTonSet.add("Ram");

		/*
		 * Returns an immutable list containing only the specified object.
		 */
		List<String> singleTonList = Collections.singletonList("Julia");

		System.out.println("singleTonList : " + singleTonList + "\n");

		/*
		 * Returns an immutable list containing only the specified object.
		 */
		Map<String, String> singletonMap = Collections.singletonMap("IN",
				"India");

		System.out.println("singleTonMap : " + singletonMap + "\n");

	}

}
