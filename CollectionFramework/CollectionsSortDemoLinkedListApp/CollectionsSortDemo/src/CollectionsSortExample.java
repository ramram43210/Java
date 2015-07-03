import java.util.Collections;
import java.util.LinkedList;

/*
 *  Example of sort(List<T> list) method.
 */

public class CollectionsSortExample
{

	public static void main(String[] args)
	{
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Dog");
		linkedList.add("Ball");
		linkedList.add("Cat");
		linkedList.add("Apple");

		System.out.println("Before Sorting  : " + linkedList + "\n");

		/*
		 * Sorts the specified list into ascending order, according to the
		 * natural ordering of its elements.
		 * 
		 * All elements in the list must implement the Comparable interface.
		 */
		Collections.sort(linkedList);

		System.out.println("After Sorting   : " + linkedList);

	}

}
