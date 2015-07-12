import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/*
 Method 

 public static <E> Set<E> newSetFromMap(Map<E,Boolean> map)

 Parameters:

 map - the backing map

 Returns:

 the set backed by the map

 */

public class CollectionsExample
{

	public static void main(String[] args)
	{

		Map<String, Boolean> map = new WeakHashMap<String, Boolean>();
		
		System.out.println("Map is: " + map);

		/*
		 * Returns a set backed by the specified map. The resulting set displays
		 * the same ordering, concurrency, and performance characteristics as
		 * the backing map. In essence, this factory method provides a Set
		 * implementation corresponding to any Map implementation. There is no
		 * need to use this method on a Map implementation that already has a
		 * corresponding Set implementation (such as HashMap or TreeMap).
		 */
		Set<String> set = Collections.newSetFromMap(map);

		System.out.println("set is: " + set);
		
		set.add("Java");
		set.add("C");
		set.add(".Net");

		System.out.println("Set is: " + set);
		System.out.println("Map is: " + map);

	}
}
