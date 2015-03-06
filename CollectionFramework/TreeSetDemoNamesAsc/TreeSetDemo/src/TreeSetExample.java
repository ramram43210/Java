import java.util.TreeSet;

/*
 *  Example of TreeSet() Constructor.
 */
public class TreeSetExample
{
	public static void main( String[] args )
	{

		/*
		 * Constructs a new, empty tree set, sorted according to the natural
		 * ordering of its elements. All elements inserted into the set must
		 * implement the Comparable interface.
		 * 
		 * Furthermore, all such elements must be mutually comparable:
		 * e1.compareTo(e2) must not throw a ClassCastException for any elements
		 * e1 and e2 in the set.
		 * 
		 * If the user attempts to add an element to the set that violates this
		 * constraint (for example, the user attempts to add a string element to
		 * a set whose elements are integers), the add call will throw a
		 * ClassCastException.
		 */
		TreeSet<String> treeSet = new TreeSet<String>();

		treeSet.add("Balu");
		treeSet.add("Carol");
		treeSet.add("Ajay");
		treeSet.add("David");
		treeSet.add("Emmy");

		System.out.println("treeSet : " + treeSet + "\n");

	}
}
