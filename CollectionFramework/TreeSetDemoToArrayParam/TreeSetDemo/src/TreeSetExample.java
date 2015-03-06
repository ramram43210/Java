import java.util.TreeSet;

/*
 * Example of toArray(T[] a) method.
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

		Integer[] integerArray = new Integer[treeSet.size()];

		/*
		 * treeSet elements will be copied to integerArray
		 */

		treeSet.toArray(integerArray);

		for( Integer value : integerArray )
		{
			System.out.println(value);
		}
	}
}
