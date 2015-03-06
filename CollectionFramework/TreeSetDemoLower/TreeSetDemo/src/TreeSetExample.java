import java.util.TreeSet;

/*
 * Example of lower(E e) method.
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
		 * Returns the greatest element in this set strictly less than the given
		 * element, or null if there is no such element.
		 */

		Integer value = treeSet.lower(32);
		System.out.println("lower(32) : " + value);
		
		value = treeSet.lower(25);
		System.out.println("lower(25) : " + value);
		
		value = treeSet.lower(5);
		System.out.println("lower(5) : " + value);
	}
}
