import java.util.TreeSet;

/*
 * Example of floor(E e) method.
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
		 * Returns the greatest element in this set less than or equal to the
		 * given element, or null if there is no such element.
		 */
		
		Integer value = treeSet.floor(22);
		System.out.println("floor(22) : " + value);

		value = treeSet.floor(37);
		System.out.println("\nfloor(37) : " + value);

		value = treeSet.floor(40);
		System.out.println("\nfloor(40) : " + value);

		value = treeSet.floor(5);
		System.out.println("\nfloor(5) : " + value);

	}
}
