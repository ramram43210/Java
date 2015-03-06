import java.util.ArrayList;
import java.util.LinkedHashSet;

/*
 * Example of retainAll(Collection<? extends E> c) method.
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
		 * Retains only the elements in this collection that are contained in
		 * the specified collection.
		 * 
		 * In other words, removes from this collection all of its elements that
		 * are not contained in the specified collection..
		 */

		boolean isRetained = linkedHashSet.retainAll(arrayList);

		System.out.println("isRetained : " + isRetained);
		System.out.println("linkedHashSet : " + linkedHashSet + "\n");

	}
}
