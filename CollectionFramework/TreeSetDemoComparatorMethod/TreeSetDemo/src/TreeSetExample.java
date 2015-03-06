import java.util.Comparator;
import java.util.TreeSet;

/*
 * Example of comparator() method.
 */
public class TreeSetExample
{
	public static void main( String[] args )
	{

		AscendingNameComparator ascendingNameComparator = new AscendingNameComparator();
		
		TreeSet<String> treeSet = new TreeSet<String>(ascendingNameComparator);

		treeSet.add("Balu");
		treeSet.add("Ajay");
		treeSet.add("David");
		treeSet.add("Charles");

		/*
		 * Returns the comparator used to order the elements in this set, or
		 * null if this set uses the natural ordering of its elements.
		 */

		Comparator<?> comparator = treeSet.comparator();

		System.out.println("comparator used : "
		        + comparator.getClass().getName());

	}
}
