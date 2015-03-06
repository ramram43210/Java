import java.util.HashSet;

/*
 * Example of toArray() method.
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

		/*
		 * Returns an array containing all of the elements in this set. 
		 * 
		 * This method acts as bridge between array-based and collection-based APIs.
		 */

		Object[] objArray = hashSet.toArray();

		for( Object object : objArray )
		{
			String name = (String) object;
			System.out.println(name);
		}

	}
}
