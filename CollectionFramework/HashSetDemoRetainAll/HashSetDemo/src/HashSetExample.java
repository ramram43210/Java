import java.util.ArrayList;
import java.util.HashSet;

/*
 * Example of retainAll(Collection<? extends E> c) method.
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
		 * Retains only the elements in this collection that are contained in
		 * the specified collection.
		 * 
		 * In other words, removes from this collection all of its elements that
		 * are not contained in the specified collection..
		 */

		boolean isRetained = hashSet.retainAll(arrayList);

		System.out.println("isRetained : " + isRetained);
		System.out.println("hashSet : " + hashSet + "\n");

	}
}
