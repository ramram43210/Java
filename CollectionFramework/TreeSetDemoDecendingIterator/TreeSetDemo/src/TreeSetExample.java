import java.util.Iterator;
import java.util.TreeSet;

/*
 * Example of descendingIterator() method.
 */
public class TreeSetExample
{
	public static void main( String[] args )
	{

		TreeSet<Integer> treeSet = new TreeSet<Integer>();

		treeSet.add(40);
		treeSet.add(20);
		treeSet.add(30);
		treeSet.add(10);
		treeSet.add(50);

		System.out.println("treeSet : " + treeSet + "\n");

		/*
		 * Returns an iterator over the elements in this set in descending
		 * order.
		 */

		Iterator<Integer> iterator = treeSet.descendingIterator();
		while( iterator.hasNext() )
		{
			Integer value = (Integer) iterator.next();
			System.out.println(value);

		}
	}
}
