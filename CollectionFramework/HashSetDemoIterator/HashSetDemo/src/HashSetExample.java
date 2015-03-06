import java.util.HashSet;
import java.util.Iterator;

/*
 * Example of iterator() method.
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

		/*
		 * Using Iterator to get each element from the HashSet.
		 */

		while( iterator.hasNext() )
		{
			String name = iterator.next();
			System.out.println(name);
		}

	}
}
