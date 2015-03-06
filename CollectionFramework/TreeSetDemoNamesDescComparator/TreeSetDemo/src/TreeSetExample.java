import java.util.TreeSet;

/*
 * Example of TreeSet(Comparator<? super E> comparator) Constructor.
 */
public class TreeSetExample
{
	public static void main( String[] args )
	{

		DescendingNameComparator decendingNameComparator = new DescendingNameComparator();

		/*
		 * Constructs a new, empty tree set, sorted according to the specified
		 * comparator.
		 * 
		 * All elements inserted into the set must be mutually comparable by the
		 * specified comparator: comparator.compare(e1, e2) must not throw a
		 * ClassCastException for any elements e1 and e2 in the set.
		 * 
		 * If the user attempts to add an element to the set that violates this
		 * constraint, the add call will throw a ClassCastException.
		 */

		TreeSet<String> treeSet = new TreeSet<String>(decendingNameComparator);

		System.out.println("Balu" + " is going to be add in treeSet");
		treeSet.add("Balu");
		System.out.println("Ajay" + " is going to be add in treeSet");
		treeSet.add("Ajay");
		System.out.println("David" + " is going to be add in treeSet");
		treeSet.add("David");
		System.out.println("Charles" + " is going to be add in treeSet");
		treeSet.add("Charles");

		System.out.println("treeSet : " + treeSet + "\n");

	}
}
