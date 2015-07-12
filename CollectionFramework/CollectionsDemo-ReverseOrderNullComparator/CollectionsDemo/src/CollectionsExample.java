import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/*
 Method 

 public static <T> Comparator<T> reverseOrder(Comparator<T> cmp)

 Parameters:

 cmp - a comparator who's ordering is to be reversed by the returned comparator or null

 Returns:

 A comparator that imposes the reverse ordering of the specified comparator.

 */

public class CollectionsExample
{

	public static void main(String[] args)
	{

		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		linkedList.add(2);
		linkedList.add(1);
		linkedList.add(4);
		linkedList.add(3);

		System.out.println("linkedList before Sort " + linkedList+"\n");

		/*
		 * Returns a comparator that imposes the reverse ordering of the
		 * specified comparator. If the specified comparator is null, this
		 * method is equivalent to reverseOrder() (in other words, it returns a
		 * comparator that imposes the reverse of the natural ordering on a
		 * collection of objects that implement the Comparable interface).
		 */
		Comparator<Integer> reverseOrderComparator = Collections.reverseOrder(null);

		// sort the list
		Collections.sort(linkedList, reverseOrderComparator);

		System.out.println("linkedList sorted in ReverseOrder: " + linkedList);

	}
}
