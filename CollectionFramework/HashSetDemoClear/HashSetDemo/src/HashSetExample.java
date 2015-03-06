import java.util.HashSet;

/*
 * Example of clear() method.
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
		 * Removes all of the elements from this set. The set will be empty
		 * after this call returns.
		 */
		hashSet.clear();;
		
		System.out.println("hashSet: " + hashSet + "\n");

	}
}
