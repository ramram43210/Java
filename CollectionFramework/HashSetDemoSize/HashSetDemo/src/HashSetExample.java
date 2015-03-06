import java.util.HashSet;

/*
 * Example of size() method.
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
		 * Returns the number of elements in this set (its cardinality).
		 */
		int size = hashSet.size();
		
		System.out.println("size : "+size);

	}
}
