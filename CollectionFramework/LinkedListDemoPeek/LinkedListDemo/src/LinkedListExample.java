import java.util.LinkedList;

/*
 * Example of peek(),peekFirst() and peekLast() methods
 */
public class LinkedListExample
{

	public static void main( String[] args )
	{
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(200);
		linkedList.add(300);
		linkedList.add(10000);
		linkedList.add(5000);
		linkedList.add(2000);

		System.out.println("linkedList : " + linkedList + "\n");

		/*
		 * Retrieves, but does not remove, the head (first element) of this
		 * list.
		 */
		Integer value = linkedList.peek();
		System.out.println("peek : " + value);

		/*
		 * Retrieves, but does not remove, the first element of this list, or
		 * returns null if this list is empty.
		 */
		value = linkedList.peekFirst();
		System.out.println("peekFirst : " + value);

		/*
		 * Retrieves, but does not remove, the last element of this list, or
		 * returns null if this list is empty.
		 */
		value = linkedList.peekLast();
		System.out.println("peekLast : " + value);

		System.out.println("\n" + "linkedList : " + linkedList + "\n");

	}
}
