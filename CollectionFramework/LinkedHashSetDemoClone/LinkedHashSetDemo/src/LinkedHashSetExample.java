import java.util.LinkedHashSet;

/*
 * Example of clone() method.
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
		 * Returns a shallow copy of this LinkedHashSet instance: the elements
		 * themselves are not cloned.
		 */
		LinkedHashSet<String> clonedLinkedHashSet = (LinkedHashSet<String>) linkedHashSet.clone();

		System.out.println("clonedLinkedHashSet : " + clonedLinkedHashSet);

	}
}
