import java.util.HashSet;

/*
 * Example of foreach loop.
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
		 * Using foreach loop get each element from the HashSet.
		 */

		for( String name : hashSet )
        {
	        System.out.println(name);
        }

	}
}
