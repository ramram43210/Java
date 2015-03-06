import java.util.LinkedList;
import java.util.TreeSet;

/*
 * Example of addAll(Collection<? extends E> c) method.
 */
public class TreeSetExample
{

	public static void main(String[] args)
	{

		TreeSet<Integer> treeSet = new TreeSet<Integer>();

		treeSet.add(40);
		treeSet.add(20);
		treeSet.add(30);

		System.out.println("treeSet : " + treeSet + "\n");

		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(100);
		linkedList.add(200);

		System.out.println("linkedList : " + linkedList + "\n");

		/*
		 * Adds all of the elements in the linkedList to the treeSet.
		 */

		boolean isAdded = treeSet.addAll(linkedList);

		System.out.println("isAdded : " + isAdded);
		System.out.println("treeSet : " + treeSet + "\n");
	}
}
