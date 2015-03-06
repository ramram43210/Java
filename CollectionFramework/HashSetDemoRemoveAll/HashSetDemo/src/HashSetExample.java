import java.util.ArrayList;
import java.util.HashSet;

/*
 * Example of removeAll(Collection<? extends E> c) method.
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

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Ram");
		arrayList.add("Dave");
		arrayList.add("Peter");

		System.out.println("arrayList : " + arrayList + "\n");

		/*
		 * Removes from this set all of its elements that are contained in the
		 * specified collection.
		 */

		boolean isRemoved = hashSet.removeAll(arrayList);

		System.out.println("isRemoved : " + isRemoved);
		System.out.println("hashSet : " + hashSet + "\n");

	}
}
