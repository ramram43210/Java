import java.util.TreeSet;

/*
 * Example of toArray() method.
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
		 * Returns an array containing all of the elements in this set.
		 * 
		 * This method acts as bridge between array-based and collection-based
		 * APIs.
		 */

		Object[] objArray = treeSet.toArray();

		for( Object object : objArray )
		{
			Integer value = (Integer) object;
			System.out.println(value);
		}
	}
}
