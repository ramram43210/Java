import java.util.ArrayList;
import java.util.HashSet;

/*
 * Example of addAll(Collection<? extends E> c) method.
 */
public class HashSetExample
{
	public static void main( String[] args )
	{
		HashSet<String> hashSet = new HashSet<String>();

		hashSet.add("Rohan");
		hashSet.add("Phil");

		System.out.println("hashSet : " + hashSet + "\n");

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Ram");
		arrayList.add("Dave");
		arrayList.add("Peter");

		System.out.println("arrayList : " + arrayList + "\n");

		/*
		 * Adds all of the elements in the arrayList to the hashSet.
		 */

		boolean isAdded = hashSet.addAll(arrayList);

		System.out.println("isAdded : " + isAdded);
		System.out.println("hashSet : " + hashSet + "\n");

	}
}
