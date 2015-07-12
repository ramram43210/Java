import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 Example of:  

 synchronizedList(List<T> list) method

 Parameters:

 list - the list to be "wrapped" in a synchronized list.

 Returns:

 a synchronized view of the specified list.
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
		 * Returns a synchronized (thread-safe) list backed by the specified
		 * list.
		 * 
		 * In order to guarantee serial access, it is critical that all access
		 * to the backing list is accomplished through the returned list.
		 */

		List<Integer> synchronizedList = Collections
				.synchronizedList(arrayList);

		System.out.println("synchronizedList : " + synchronizedList + "\n");

	}

}
