import java.util.ArrayList;
import java.util.LinkedHashSet;

/*
 * Example of containsAll(Collection<? extends E> c) method.
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

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Ram");
		arrayList.add("Dave");
		arrayList.add("Peter");

		System.out.println("arrayList : " + arrayList + "\n");

		/*
		 * Returns true if this collection contains all of the elements in the
		 * specified collection.
		 */

		boolean isExist = linkedHashSet.containsAll(arrayList);

		System.out.println("isExist : " + isExist);

	}
}
