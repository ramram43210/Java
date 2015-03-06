import java.util.Iterator;
import java.util.TreeSet;

/*
 * Example of iterator() method.
 */
public class TreeSetExample
{
	public static void main( String[] args )
	{

		TreeSet<Integer> treeSet = new TreeSet<Integer>();

		treeSet.add(10);
		treeSet.add(50);
		treeSet.add(40);
		treeSet.add(20);
		treeSet.add(30);

		System.out.println("treeSet : " + treeSet + "\n");

		/*
		 * Returns an iterator over the elements in this set in ascending order.
		 */

		Iterator<Integer> iterator = treeSet.iterator();

		/*
		 * Using Iterator to get each element from the TreeSet.
		 */

		while( iterator.hasNext() )
		{
			Integer value = iterator.next();
			System.out.println(value);
		}
	}
}
