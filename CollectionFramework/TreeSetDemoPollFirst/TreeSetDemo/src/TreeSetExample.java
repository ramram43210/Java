import java.util.TreeSet;

/*
 * Example of pollFirst() method.
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
		 * Retrieves and removes the first (lowest) element, or returns null if
		 * this set is empty.
		 */

		Integer value = treeSet.pollFirst();
		System.out.println("value : " + value);

		System.out.println("treeSet : " + treeSet + "\n");

	}
}
