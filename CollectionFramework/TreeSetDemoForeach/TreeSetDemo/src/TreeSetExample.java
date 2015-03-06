import java.util.TreeSet;

/*
 * Example of for-each loop.
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
		 * Using foreach loop get each element from the treeSet.
		 */

		for( Integer value : treeSet )
		{
			System.out.println(value);
		}
	}
}
