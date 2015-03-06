import java.util.HashSet;

/*
 * Example of toArray(T[] a) method.
 */
public class HashSetExample
{
	public static void main( String[] args )
	{
		HashSet<String> hashSet = new HashSet<String>();

		hashSet.add("Rohan");
		hashSet.add("Phil");
		hashSet.add("Ram");
		hashSet.add("Dave");
		hashSet.add("Peter");

		System.out.println("hashSet : " + hashSet + "\n");

		String[] strArray = new String[hashSet.size()];

		/*
		 * hashSet elements will be copied to StrArray
		 */

		hashSet.toArray(strArray);

		for( String name : strArray )
		{
			System.out.println(name);
		}

	}
}
