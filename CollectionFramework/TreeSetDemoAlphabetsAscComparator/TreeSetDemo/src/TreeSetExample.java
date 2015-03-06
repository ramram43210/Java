import java.util.TreeSet;

/*
 * Example of  TreeSet(Comparator<? super E> comparator) Constructor.
 */
public class TreeSetExample
{
	public static void main( String[] args )
	{

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
		AscendingAlphabetsComparator ascendingAlphabetsComparator = new AscendingAlphabetsComparator();
		
		TreeSet<String> treeSet = new TreeSet<String>(
				ascendingAlphabetsComparator);

		System.out.println("B" + " is going to be add in treeSet");
		treeSet.add("B");
		System.out.println("C" + " is going to be add in treeSet");
		treeSet.add("C");
		System.out.println("A" + " is going to be add in treeSet");
		treeSet.add("A");
		System.out.println("B" + " is going to be add in treeSet");
		treeSet.add("D");

		System.out.println("treeSet : " + treeSet + "\n");

	}
}
