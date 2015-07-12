import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapFailFastExample
{

	public static void main( String[] args )
	{

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		hashMap.put(1, "Apple");
		hashMap.put(2, "Ball");
		hashMap.put(3, "Cat");

		System.out.println("hashMap : " + hashMap);

		Set<Integer> keys = hashMap.keySet();

		/*
		 * Iterator in the HashMap/Hashtable is fail-fast
		 */
		Iterator<Integer> iterator = keys.iterator();

		while( iterator.hasNext() )
		{
			Integer key = iterator.next();

			/*
			 * Throw ConcurrentModificationException if we modifies the map
			 * structurally by adding or removing any element except Iterator's
			 * own remove() method.
			 */

			hashMap.put(4,"Dove");			
			System.out.println("key : " + key);

		}

	}
}