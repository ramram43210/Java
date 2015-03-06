import java.util.HashSet;

/*
 * Example of clone() method.
 */
public class HashSetExample
{
	public static void main( String[] args )
	{
		HashSet<String> hashSet = new HashSet<String>();

		hashSet.add("Dave");
		hashSet.add("Peter");
		hashSet.add("Phil");
		hashSet.add("Rohit");
		hashSet.add("Virat");

		System.out.println("hashSet: " + hashSet + "\n");

		/*
		 * Returns a shallow copy of this HashSet instance: the elements
		 * themselves are not cloned.
		 */
		HashSet<String> clonedHashSet = (HashSet<String>) hashSet.clone();

		System.out.println("clonedHashSet : " + clonedHashSet);

	}
}
