import java.util.LinkedHashSet;

/*
 * Example of remove(Object o) method.
 */
public class LinkedHashSetExample
{
	public static void main( String[] args )
	{
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

		linkedHashSet.add("Dave");
		linkedHashSet.add("Peter");
		linkedHashSet.add("Phil");
		linkedHashSet.add("Rohit");
		linkedHashSet.add("Virat");

		System.out.println("linkedHashSet : " + linkedHashSet + "\n");

		/*
		 * Removes the specified element from this set if it is present.
		 */

		boolean isRemoved = linkedHashSet.remove("Virat");
		System.out.println("isRemoved : " + isRemoved);

		System.out.println("linkedHashSet : " + linkedHashSet + "\n");

	}
}
