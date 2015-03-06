import java.util.HashMap;
import java.util.Set;

/*
 * Example of keySet() method.
 */
public class HashMapExample
{
	public static void main( String[] args )
	{

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		hashMap.put(1, "Apple");
		hashMap.put(2, "Ball");
		hashMap.put(3, "Cat");

		System.out.println("hashMap : " + hashMap + "\n");

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
		Set<Integer> set = hashMap.keySet();

		System.out.println("set : " + set + "\n");
		
		System.out.println("-----------------------");
		System.out.println("Key" +" | " + "value");
		System.out.println("-----------------------");

		for( Integer key : set )
		{
			String value = hashMap.get(key);
			System.out.println(key + "   |  " + value);
			
		}

	}
}
