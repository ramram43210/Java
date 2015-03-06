import java.util.ArrayList;
import java.util.LinkedHashSet;

/*
 * Example of removeAll(Collection<? extends E> c) method.
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
		 * Removes from this set all of its elements that are contained in the
		 * specified collection.
		 */

		boolean isRemoved = linkedHashSet.removeAll(arrayList);

		System.out.println("isRemoved : " + isRemoved);
		System.out.println("linkedHashSet : " + linkedHashSet + "\n");

	}
}
