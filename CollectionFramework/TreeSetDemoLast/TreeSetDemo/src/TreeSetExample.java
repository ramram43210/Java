import java.util.TreeSet;

/*
 * Example of last() method.
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
		 * Returns the last (highest) element currently in this set.
		 */

		Integer value = treeSet.last();

		System.out.println("value : " + value);
	}
}
