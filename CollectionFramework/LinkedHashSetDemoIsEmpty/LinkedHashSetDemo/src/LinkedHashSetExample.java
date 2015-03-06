import java.util.LinkedHashSet;

/*
 * Example of  isEmpty() method.
 */
public class LinkedHashSetExample
{
	public static void main( String[] args )
	{
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

		System.out.println("linkedHashSet: " + linkedHashSet);
		/*
		 * Returns true if this set contains no elements.
		 */
		boolean isEmpty = linkedHashSet.isEmpty();
		System.out.println("isEmpty :  " + isEmpty + "\n");

		linkedHashSet.add("Dave");
		linkedHashSet.add("Peter");
		linkedHashSet.add("Phil");
		linkedHashSet.add("Rohit");
		linkedHashSet.add("Virat");

		System.out.println("linkedHashSet: " + linkedHashSet);

		isEmpty = linkedHashSet.isEmpty();
		System.out.println("isEmpty :  " + isEmpty);

	}
}
