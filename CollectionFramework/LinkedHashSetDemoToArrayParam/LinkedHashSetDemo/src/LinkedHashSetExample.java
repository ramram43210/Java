import java.util.LinkedHashSet;

/*
 * Example of toArray(T[] a) method.
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

		String[] strArray = new String[linkedHashSet.size()];

		/*
		 * linkedHashSet elements will be copied to StrArray
		 */

		linkedHashSet.toArray(strArray);

		for( String name : strArray )
		{
			System.out.println(name);
		}

	}
}
