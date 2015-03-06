import java.util.TreeSet;

/*
 * Example of higher(E e) method.
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
		 * Returns the least element in this set strictly greater than the given
		 * element, or null if there is no such element.
		 */

		Integer value = treeSet.higher(32);
		System.out.println("higher(32) : " + value);

		value = treeSet.higher(16);
		System.out.println("higher(16) : " + value);

		value = treeSet.higher(55);
		System.out.println("higher(55) : " + value);
	}
}
