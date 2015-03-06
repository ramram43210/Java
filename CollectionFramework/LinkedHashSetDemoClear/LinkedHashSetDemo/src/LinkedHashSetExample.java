import java.util.LinkedHashSet;

/*
 * Example of clear() method.
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

		System.out.println("linkedHashSet: " + linkedHashSet + "\n");

		/*
		 * Removes all of the elements from this set. The set will be empty
		 * after this call returns.
		 */
		linkedHashSet.clear();
		
		System.out.println("linkedHashSet: " + linkedHashSet + "\n");

	}
}
