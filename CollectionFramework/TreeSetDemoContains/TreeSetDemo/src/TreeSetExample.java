import java.util.TreeSet;

/*
 * Example of contains(Object o) method.
 */
public class TreeSetExample
{
	public static void main(String[] args)
	{

		TreeSet<Integer> treeSet = new TreeSet<Integer>();

		treeSet.add(40);
		treeSet.add(20);
		treeSet.add(30);
		treeSet.add(10);
		treeSet.add(50);

		System.out.println("treeSet : " + treeSet + "\n");

		/*
		 * Returns true if this set contains the specified element.
		 */

		boolean isExist = treeSet.contains(20);

		System.out.println("isExist : " + isExist);
	}
}
