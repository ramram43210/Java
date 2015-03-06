import java.util.TreeSet;

/*
 * Example of size() method.
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
		 * Returns the number of elements in this set (its cardinality).
		 */
		int size = treeSet.size();

		System.out.println("size : " + size);

	}
}
