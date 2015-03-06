import java.util.LinkedList;
import java.util.TreeSet;

/*
 * Example of retainAll(Collection<?> c) method.
 */
public class TreeSetExample
{
	public static void main( String[] args )
	{

		TreeSet<Integer> treeSet = new TreeSet<Integer>();

		treeSet.add(40);
		treeSet.add(20);
		treeSet.add(30);
		treeSet.add(100);
		treeSet.add(200);

		System.out.println("treeSet : " + treeSet + "\n");

		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		linkedList.add(100);
		linkedList.add(200);

		System.out.println("linkedList : " + linkedList + "\n");

		/*
		 * Retains only the elements in this set that are contained in the
		 * specified collection (optional operation). In other words, removes
		 * from this set all of its elements that are not contained in the
		 * specified collection.
		 * 
		 * If the specified collection is also a set, this operation effectively
		 * modifies this set so that its value is the intersection of the two
		 * sets.
		 */

		boolean isRetained = treeSet.retainAll(linkedList);

		System.out.println("isRetained : " + isRetained);
		System.out.println("treeSet : " + treeSet + "\n");
	}
}
