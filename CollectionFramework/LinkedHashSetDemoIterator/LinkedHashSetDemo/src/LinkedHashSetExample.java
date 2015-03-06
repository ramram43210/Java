import java.util.LinkedHashSet;
import java.util.Iterator;

/*
 * Example of iterator() method.
 */
public class LinkedHashSetExample
{
	public static void main( String[] args )
	{
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

		linkedHashSet.add("Dave");
		linkedHashSet.add("Peter");
		linkedHashSet.add("Phil");
		linkedHashSet.add("Rohit");
		linkedHashSet.add("Virat");

		System.out.println("linkedHashSet : " + linkedHashSet + "\n");

		/*
		 * Returns an iterator over the elements in this set. The elements are
		 * returned in no particular order (unless this set is an instance of
		 * some class that provides a guarantee).
		 */

		Iterator<String> iterator = linkedHashSet.iterator();

		/*
		 * Using Iterator to get each element from the LinkedHashSet.
		 */

		while( iterator.hasNext() )
		{
			String name = iterator.next();
			System.out.println(name);
		}

	}
}
