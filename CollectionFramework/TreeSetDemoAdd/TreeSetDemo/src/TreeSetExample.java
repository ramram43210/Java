import java.util.TreeSet;

/*
 * Example of add(E e) method.
 */
public class TreeSetExample
{
	public static void main( String[] args )
	{

		TreeSet<Integer> treeSet = new TreeSet<Integer>();

		System.out.println("treeSet : " + treeSet + "\n");

		/*
		 * Adds the specified element to this set if it is not already present.
		 * 
		 * If this set already contains the element, the call leaves the set
		 * unchanged and returns false.
		 */
		boolean isAdded = treeSet.add(10);

		System.out.println("isAdded : " + isAdded);
		System.out.println("treeSet: " + treeSet + "\n");

		isAdded = treeSet.add(10);

		System.out.println("isAdded : " + isAdded);
		System.out.println("treeSet: " + treeSet + "\n");

	}
}
