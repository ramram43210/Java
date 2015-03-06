import java.util.HashSet;

/*
 * Example of isEmpty() method.
 */
public class HashSetExample
{
	public static void main( String[] args )
	{
		HashSet<String> hashSet = new HashSet<String>();

		System.out.println("hashSet: " + hashSet);
		/*
		 * Returns true if this set contains no elements.
		 */
		boolean isEmpty = hashSet.isEmpty();
		System.out.println("isEmpty :  " + isEmpty + "\n");

		hashSet.add("Dave");
		hashSet.add("Peter");
		hashSet.add("Phil");
		hashSet.add("Rohit");
		hashSet.add("Virat");

		System.out.println("hashSet: " + hashSet);

		isEmpty = hashSet.isEmpty();
		System.out.println("isEmpty :  " + isEmpty);

	}
}
