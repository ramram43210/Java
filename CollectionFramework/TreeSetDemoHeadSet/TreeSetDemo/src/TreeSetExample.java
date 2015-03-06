import java.util.SortedSet;
import java.util.TreeSet;

/*
 * Example of headSet(E toElement) method.
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
		 * Returns a view of the portion of this set whose elements are strictly
		 * less than toElement.
		 * 
		 * The returned set is backed by this set, so changes in the returned
		 * set are reflected in this set, and vice-versa. The returned set
		 * supports all optional set operations that this set supports.
		 * 
		 * Equivalent to headSet(toElement, false).
		 */

		SortedSet<Integer> sortedSet = treeSet.headSet(40);
		System.out.println("sortedSet : " + sortedSet + "\n");

		System.out.println("--------------------------------------------\n");

		sortedSet.remove(10);

		System.out.println("After removing element '10' in SortedSet \n");
		System.out.println("sortedSet : " + sortedSet);
		System.out.println("treeSet : " + treeSet + "\n");

	}
}
