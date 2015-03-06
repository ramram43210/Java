import java.util.NavigableSet;
import java.util.TreeSet;

/*
 * Example of headSet(E fromElement,boolean inclusive) method.
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
		 * Returns a view of the portion of this set whose elements are less
		 * than (or equal to, if inclusive is true) toElement.
		 * 
		 * The returned set is backed by this set, so changes in the returned
		 * set are reflected in this set, and vice-versa. The returned set
		 * supports all optional set operations that this set supports.
		 */

		NavigableSet<Integer> navigableSet = treeSet.headSet(40, false);

		System.out.println("inclusive is false , navigableSet : "
		        + navigableSet + "\n");

		navigableSet = treeSet.headSet(40, true);

		System.out.println("inclusive is true , navigableSet : " + navigableSet
		        + "\n");

	}
}
