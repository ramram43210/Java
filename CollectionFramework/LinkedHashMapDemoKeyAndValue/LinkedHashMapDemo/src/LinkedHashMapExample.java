import java.util.LinkedHashMap;
import java.util.Set;

/*
 * Example of keySet() method.
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
		Set<Integer> set = linkedHashMap.keySet();

		System.out.println("set : "+set + "\n");	
		
		System.out.println("-----------------------");
		System.out.println("Key" +" | " + "value");
		System.out.println("-----------------------");

		for( Integer key : set )
		{
			String value = linkedHashMap.get(key);
			System.out.println(key + "   |  " + value);
			
		}
	}
}
