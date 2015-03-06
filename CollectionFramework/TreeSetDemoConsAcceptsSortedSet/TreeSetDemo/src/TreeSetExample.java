import java.util.SortedSet;
import java.util.TreeSet;

/*
 * Example of TreeSet(SortedSet<E> s) Constructor.
 */
public class TreeSetExample
{
	public static void main( String[] args )
	{

		SortedSet<Integer> sortedSet = new TreeSet<Integer>();

		sortedSet.add(40);
		sortedSet.add(20);
		sortedSet.add(30);
		sortedSet.add(10);
		sortedSet.add(50);

		System.out.println("sortedSet : " + sortedSet);

		/*
		 * Constructs a new tree set containing the same elements and using the
		 * same ordering as the specified sorted set.
		 */
		TreeSet<Integer> treeSet = new TreeSet<Integer>(sortedSet);

		System.out.println("\ntreeSet : " + treeSet);

	}
}
