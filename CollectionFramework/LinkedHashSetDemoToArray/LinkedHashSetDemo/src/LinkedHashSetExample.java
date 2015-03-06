import java.util.LinkedHashSet;

/*
 * Example of toArray() method.
 */
public class LinkedHashSetExample
{
	public static void main( String[] args )
	{
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

		linkedHashSet.add("Rohan");
		linkedHashSet.add("Phil");
		linkedHashSet.add("Ram");
		linkedHashSet.add("Dave");
		linkedHashSet.add("Peter");

		System.out.println("linkedHashSet : " + linkedHashSet + "\n");

		/*
		 * Returns an array containing all of the elements in this set. 
		 * 
		 * This method acts as bridge between array-based and collection-based APIs.
		 */

		Object[] objArray = linkedHashSet.toArray();

		for( Object object : objArray )
		{
			String name = (String) object;
			System.out.println(name);
		}

	}
}
