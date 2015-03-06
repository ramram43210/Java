import java.util.LinkedHashSet;

/*
 * Example of size() method.
 */
public class LinkedHashSetExample
{
	public static void main( String[] args )
	{
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

		linkedHashSet.add("Dave");
		linkedHashSet.add("Peter");
		linkedHashSet.add("Juli");
		linkedHashSet.add("Rohit");
		linkedHashSet.add("Virat");

		System.out.println("linkedHashSet: " + linkedHashSet + "\n");

		/*
		 * Returns the number of elements in this set (its cardinality).
		 */
		int size = linkedHashSet.size();
		
		System.out.println("size : "+size);

	}
}
