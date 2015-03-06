import java.util.LinkedList;
import java.util.TreeSet;

/*
 * Example of removeAll(Collection<? extends E> c) method.
 */
public class TreeSetExample
{
	public static void main(String[] args)
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
		 * Removes from this set all of its elements that are contained in the
		 * specified collection
		 */

		boolean isRemoved = treeSet.removeAll(linkedList);

		System.out.println("isRemoved : " + isRemoved);
		System.out.println("treeSet : " + treeSet + "\n");
	}
}
