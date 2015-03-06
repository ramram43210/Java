import java.util.LinkedList;
import java.util.TreeSet;

/*
 * Example of containsAll(Collection<?> c) method.
 */
public class TreeSetExample
{
	public static void main( String[] args )
	{

		TreeSet<Integer> treeSet = new TreeSet<Integer>();

		treeSet.add(40);
		treeSet.add(20);
		treeSet.add(30);
		treeSet.add(1000);
		treeSet.add(2000);

		System.out.println("treeSet : " + treeSet + "\n");

		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		linkedList.add(1000);
		linkedList.add(2000);

		System.out.println("linkedList : " + linkedList + "\n");

		/*
		 * Returns true if this set contains all of the elements of the
		 * specified collection.
		 * 
		 * If the specified collection is also a set, this method returns true
		 * if it is a subset of this set.
		 */

		boolean isExist = treeSet.containsAll(linkedList);

		System.out.println("isExist : " + isExist);
	}
}
