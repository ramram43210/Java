import java.util.SortedSet;
import java.util.TreeSet;

/*
 * Example of subSet(E fromElement,E toElement) method.
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
		treeSet.add(60);
		treeSet.add(80);
		treeSet.add(70);

		System.out.println("treeSet : " + treeSet + "\n");

		/*
		 * Returns a view of the portion of this set whose elements range from
		 * fromElement, inclusive, to toElement, exclusive. (If fromElement and
		 * toElement are equal, the returned set is empty.)
		 * 
		 * The returned set is backed by this set, so changes in the returned
		 * set are reflected in this set, and vice-versa. The returned set
		 * supports all optional set operations that this set supports.
		 * 
		 * Equivalent to subSet(fromElement, true, toElement, false).
		 */

		SortedSet<Integer> sortedSet = treeSet.subSet(20, 60);

		System.out.println("sortedSet  : " + sortedSet + "\n");
		
		System.out.println("--------------------------------------------\n");

		sortedSet.remove(20);

		System.out.println("After removing element '20' in SortedSet \n");
		System.out.println("sortedSet : " + sortedSet);
		System.out.println("treeSet : " + treeSet + "\n");

	}
}
