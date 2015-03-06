import java.util.TreeSet;

/*
 * Example of clone() method.
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
		 * Returns a shallow copy of this TreeSet instance. (The elements
		 * themselves are not cloned.)
		 */
		TreeSet<String> clonedTreeSet = (TreeSet<String>) treeSet.clone();

		System.out.println("clonedTreeSet : " + clonedTreeSet);

	}
}
