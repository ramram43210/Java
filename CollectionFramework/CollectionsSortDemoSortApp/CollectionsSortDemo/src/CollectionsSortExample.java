import java.util.ArrayList;
import java.util.Collections;

/*
 *  Example of sort(List<T> list) method
 */

public class CollectionsSortExample
{

	public static void main(String[] args)
	{
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(400);
		arrayList.add(200);
		arrayList.add(100);
		arrayList.add(300);

		System.out.println("Before Sorting  : " + arrayList + "\n");

		/*
		 * Sorts the specified list into ascending order, according to the
		 * natural ordering of its elements.
		 * 
		 * All elements in the list must implement the Comparable interface.
		 */
		Collections.sort(arrayList);

		System.out.println("After Sorting   : " + arrayList);

	}

}
