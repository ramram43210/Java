import java.util.LinkedHashSet;

/*
 * Example of LinkedHashSet() Constructor.
 */
public class LinkedHashSetExample
{
	public static void main( String[] args )
	{
		/*
		 * Constructs a new, empty linked hash set with the default initial
		 * capacity (16) and load factor (0.75).
		 */
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		
		System.out.println("linkedHashSet: " + linkedHashSet + "\n");

		linkedHashSet.add("Dave");
		linkedHashSet.add("Peter");
		linkedHashSet.add("Phil");
		linkedHashSet.add("Rohit");
		linkedHashSet.add("Virat");

		System.out.println("linkedHashSet: " + linkedHashSet + "\n");

	}
}
