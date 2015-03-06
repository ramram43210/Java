import java.util.ArrayList;
import java.util.LinkedHashSet;

/*
 * Example of addAll(Collection<? extends E> c) method.
 */
public class LinkedHashSetExample
{
	public static void main( String[] args )
	{
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

		linkedHashSet.add("Rohan");
		linkedHashSet.add("Phil");

		System.out.println("linkedHashSet : " + linkedHashSet + "\n");

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Ram");
		arrayList.add("Dave");
		arrayList.add("Peter");

		System.out.println("arrayList : " + arrayList + "\n");

		/*
		 * Adds all of the elements in the arrayList to the linkedHashSet.
		 */

		boolean isAdded = linkedHashSet.addAll(arrayList);

		System.out.println("isAdded : " + isAdded);
		System.out.println("linkedHashSet : " + linkedHashSet + "\n");

	}
}
