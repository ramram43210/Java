import java.util.TreeSet;

/*
 * Example of pollLast() method.
 */
public class TreeSetExample
{
	public static void main( String[] args )
	{

		TreeSet<Integer> treeSet = new TreeSet<Integer>();

		treeSet.add(40);
		treeSet.add(20);
		treeSet.add(30);
		treeSet.add(10);
		treeSet.add(50);

		System.out.println("treeSet : " + treeSet + "\n");

		/*
		 * Retrieves and removes the last (highest) element, or returns null if
		 * this set is empty.
		 */

		Integer value = treeSet.pollLast();
		System.out.println("value : " + value);

		System.out.println("treeSet : " + treeSet + "\n");

	}
}
