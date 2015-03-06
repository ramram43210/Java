import java.util.LinkedList;

/*
 * Example of pollFirst() and pollLast() methods
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
		
		System.out.println("linkedList : " + linkedList + "\n");
		
		/*
		 * Retrieves and removes the first element of this list, or returns null
		 * if this list is empty.
		 */
		Integer value = linkedList.pollFirst();
		System.out.println("pollFirst : value " + value);
		System.out.println("linkedList : " + linkedList + "\n");

		/*
		 * Retrieves and removes the last element of this list, or returns null
		 * if this list is empty.
		 */
		value = linkedList.pollLast();
		System.out.println("pollLast : value " + value);
		System.out.println( "linkedList : " + linkedList + "\n");

	}
}
