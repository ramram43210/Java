import java.util.TreeSet;

/*
 * Example of remove(Object o) method.
 */
public class TreeSetExample
{
	public static void main( String[] args )
	{

		TreeSet<Integer> treeSet = new TreeSet<Integer>();

		treeSet.add(10);
		treeSet.add(50);
		treeSet.add(40);
		treeSet.add(20);
		treeSet.add(30);

		System.out.println("treeSet : " + treeSet + "\n");
		/*
		 * Removes the specified element from this set if it is present.
		 */

		boolean isRemoved = treeSet.remove(50);
		System.out.println("isRemoved : " + isRemoved);

		System.out.println("treeSet : " + treeSet + "\n");
	}
}
