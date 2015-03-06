import java.util.LinkedHashSet;
import java.util.Iterator;

/*
 * Example of Iterator remove() method.
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

		while( iterator.hasNext() )
		{
			iterator.next();
			/*
			 * Removes from the list the last element that was returned by
			 * next()
			 */
			iterator.remove();
		}

		System.out.println("linkedHashSet : " + linkedHashSet + "\n");
	}
}
