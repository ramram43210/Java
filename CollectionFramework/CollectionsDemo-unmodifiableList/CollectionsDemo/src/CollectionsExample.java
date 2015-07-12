import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 Example of:  

 	unmodifiableList(List<? extends T> list) method

 Parameters:

 	list - the list for which an unmodifiable view is to be returned.

 Returns:

 	an unmodifiable view of the specified list.
 */

public class CollectionsExample
{

	public static void main(String[] args)
	{

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		arrayList.add(2000);
		arrayList.add(3000);
		arrayList.add(4000);
		arrayList.add(1000);

		System.out.println("arrayList : " + arrayList + "\n");

		/*
		 * Returns an unmodifiable view of the specified list. 
		 * 
		 * This method allows modules to provide users with "read-only" access to internal
		 * lists. 
		 * 
		 * Query operations on the returned list "read through" to the
		 * specified list, and attempts to modify the returned list, whether
		 * direct or via its iterator, result in an
		 * UnsupportedOperationException.
		 */

		List<Integer> unmodifiableList = Collections.unmodifiableList(arrayList);

		System.out.println("unmodifiableList : " + unmodifiableList+"\n");

		/* 
		 * We cannot modify the unmodifiableList.
		 */
		unmodifiableList.add(200);

	}

}
