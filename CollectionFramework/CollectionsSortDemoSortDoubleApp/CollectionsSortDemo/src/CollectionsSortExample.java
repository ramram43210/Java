import java.util.ArrayList;
import java.util.Collections;

/*
 *  Example of sort(List<T> list) method
 */

public class CollectionsSortExample
{

	public static void main(String[] args)
	{
		ArrayList<Double> arrayList = new ArrayList<Double>();
		arrayList.add(1.4);
		arrayList.add(1.2);
		arrayList.add(1.3);
		arrayList.add(1.1);

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
