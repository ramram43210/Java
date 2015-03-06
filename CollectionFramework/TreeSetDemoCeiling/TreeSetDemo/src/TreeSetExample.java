import java.util.TreeSet;

/*
 * Example of ceiling(E e) method.
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
		 * Returns the least element in this set greater than or equal to the
		 * given element, or null if there is no such element.
		 */
		Integer value = treeSet.ceiling(14);
		System.out.println("\nceiling(14) : " + value);

		value = treeSet.ceiling(21);
		System.out.println("\nceiling(21) : " + value);

		value = treeSet.ceiling(40);
		System.out.println("\nceiling(40) : " + value);

		value = treeSet.ceiling(53);
		System.out.println("\nceiling(53) : " + value);

	}
}
