import java.util.HashSet;

/*
 * Example of remove(Object o) method.
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

		System.out.println("hashSet : " + hashSet + "\n");

		/*
		 * Removes the specified element from this set if it is present.
		 */

		boolean isRemoved = hashSet.remove("Virat");
		System.out.println("isRemoved : " + isRemoved);

		System.out.println("hashSet : " + hashSet + "\n");

	}
}
