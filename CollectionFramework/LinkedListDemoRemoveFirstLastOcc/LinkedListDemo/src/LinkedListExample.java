import java.util.LinkedList;

/*
 * Example of removeFirstOccurrence(Object o) and removeLastOccurrence(Object o) methods
 */
public class LinkedListExample
{

	public static void main( String[] args )
	{
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(200);
		linkedList.add(300);
		linkedList.add(200);
		linkedList.add(5000);
		linkedList.add(200);
		linkedList.add(800);

		System.out.println("linkedList : " + linkedList + "\n");

		/*
		 * Removes the first occurrence of the specified element in this list
		 * (when traversing the list from head to tail). If the list does not
		 * contain the element, it is unchanged.
		 */
		boolean isRemoved = linkedList.removeFirstOccurrence(200);
		System.out.println("isRemoved : " + isRemoved);
		System.out.println("linkedList : " + linkedList + "\n");

		/*
		 * Removes the last occurrence of the specified element in this list
		 * (when traversing the list from head to tail). If the list does not
		 * contain the element, it is unchanged.
		 */
		isRemoved = linkedList.removeLastOccurrence(200);
		System.out.println("isRemoved : " + isRemoved);
		System.out.println("linkedList : " + linkedList + "\n");

	}
}
