import java.util.ArrayList;
import java.util.HashSet;

/*
 * Example of containsAll(Collection<? extends E> c) method.
 */
public class HashSetExample
{
	public static void main( String[] args )
	{
		HashSet<String> hashSet = new HashSet<String>();

		hashSet.add("Rohan");
		hashSet.add("Juli");
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
		 * Returns true if this collection contains all of the elements in the
		 * specified collection.
		 */

		boolean isExist = hashSet.containsAll(arrayList);

		System.out.println("isExist : " + isExist);

	}
}
