import java.util.SortedSet;
import java.util.TreeSet;

/*
 * Example of subSet(E fromElement,
 					boolean fromInclusive,
 					E toElement,
 					boolean toInclusive) method.
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
		 * fromElement to toElement.
		 * 
		 * If fromElement and toElement are equal, the returned set is empty
		 * unless fromInclusive and toInclusive are both true.
		 * 
		 * The returned set is backed by this set, so changes in the returned
		 * set are reflected in this set, and vice-versa. The returned set
		 * supports all optional set operations that this set supports.
		 */

		SortedSet<Integer> sortedSet = treeSet.subSet(20, false, 60, false);

		System.out
		        .println("fromInclusive and toInclusive are false , sortedSet  : "
		                + sortedSet + "\n");

		sortedSet = treeSet.subSet(20, true, 60, true);

		System.out
		        .println("fromInclusive and toInclusive are true , sortedSet  : "
		                + sortedSet + "\n");

	}
}
