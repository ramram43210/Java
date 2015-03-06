import java.util.TreeSet;

/*
 * Example of TreeSet(Comparator<? super E> comparator) Constructor.
 */
public class TreeSetExample
{
	public static void main(String[] args)
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
		AscendingNumberComparator ascendingNumberComparator = new AscendingNumberComparator();
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>(
				ascendingNumberComparator);

		System.out.println(20 + " is going to be add in treeSet");
		treeSet.add(20);
		System.out.println(40 + " is going to be add in treeSet");
		treeSet.add(40);
		System.out.println(30 + " is going to be add in treeSet");
		treeSet.add(30);
		System.out.println(10 + " is going to be add in treeSet");
		treeSet.add(10);

		System.out.println("treeSet : " + treeSet + "\n");

	}
}
