import java.util.TreeSet;

/*
 * Example of isEmpty() method.
 */
public class TreeSetExample
{
	public static void main( String[] args )
	{

		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		System.out.println("treeSet : " + treeSet + "\n");
		
		/*
		 * Returns true if this set contains no elements.
		 */
		boolean isEmpty = treeSet.isEmpty();
		System.out.println("isEmpty :  " + isEmpty + "\n");


		treeSet.add(10);
		treeSet.add(50);
		treeSet.add(40);
		treeSet.add(20);
		treeSet.add(30);

		System.out.println("treeSet : " + treeSet + "\n");

		/*
		 * Returns true if this set contains no elements.
		 */
		isEmpty = treeSet.isEmpty();
		System.out.println("isEmpty :  " + isEmpty);
	}
}
