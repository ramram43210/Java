import java.util.HashSet;

/*
 * Example of HashSet() Constructor.
 */
public class HashSetExample
{
	public static void main( String[] args )
	{
		/*
		 * Constructs a new, empty set; the backing HashMap instance has default
		 * initial capacity (16) and load factor (0.75).
		 */
		HashSet<String> hashSet = new HashSet<String>();

		hashSet.add("Dave");
		hashSet.add("Peter");
		hashSet.add("Phil");
		hashSet.add("Rohit");
		hashSet.add("Virat");

		System.out.println("hashSet: " + hashSet + "\n");

	}
}
