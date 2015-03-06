import java.util.HashSet;
import java.util.Iterator;

/*
 * Example of Iterator remove() method.
 */
public class HashSetExample
{
	public static void main( String[] args )
	{
		HashSet<String> hashSet = new HashSet<String>();

		hashSet.add("Dave");
		hashSet.add("Peter");
		hashSet.add("Phil");
		hashSet.add("Rohit");
		hashSet.add("Virat");

		System.out.println("hashSet : " + hashSet + "\n");

		/*
		 * Returns an iterator over the elements in this set. The elements are
		 * returned in no particular order.
		 */

		Iterator<String> iterator = hashSet.iterator();

		
		while( iterator.hasNext() )
		{
			iterator.next();
			/*
			 * Removes from the set, the last element that was returned by
			 * next()
			 */
			iterator.remove();
		}
		
		System.out.println("hashSet : " + hashSet + "\n");
	}
}
