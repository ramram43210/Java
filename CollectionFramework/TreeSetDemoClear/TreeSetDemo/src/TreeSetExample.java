import java.util.TreeSet;

/*
 * Example of clear() method.
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
		 * Removes all of the elements from this set. The set will be empty
		 * after this call returns.
		 */
		treeSet.clear();

		System.out.println("treeSet : " + treeSet + "\n");

	}
}
