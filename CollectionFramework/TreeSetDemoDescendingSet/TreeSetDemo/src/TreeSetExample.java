import java.util.NavigableSet;
import java.util.TreeSet;

/*
 * Example of descendingSet() method.
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
		 * Returns a reverse order view of the elements contained in this set.
		 * The descending set is backed by this set, so changes to the set are
		 * reflected in the descending set, and vice-versa.
		 * 
		 * If either set is modified while an iteration over either set is in
		 * progress (except through the iterator's own remove operation), the
		 * results of the iteration are undefined.
		 */

		NavigableSet<Integer> navigableSet = treeSet.descendingSet();

		System.out.println("navigableSet : " + navigableSet + "\n");

		for( Integer value : navigableSet )
		{
			System.out.println(value);
		}

	}
}
