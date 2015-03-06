import java.util.LinkedList;
import java.util.TreeSet;

/*
 * Example of TreeSet(Collection<? extends E> c) constructor.
 */
public class TreeSetExample
{
	public static void main( String[] args )
	{
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(50);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(10);
		linkedList.add(20);

		System.out.println("linkedList : " + linkedList + "\n");
		
		/*
		 * Constructs a new tree set containing the elements in the specified
		 * collection, sorted according to the natural ordering of its elements.
		 * 
		 * All elements inserted into the set must implement the Comparable
		 * interface.
		 */
		TreeSet<Integer> treeSet = new TreeSet<Integer>(linkedList);

		System.out.println("treeSet : " + treeSet + "\n");

	}
}
