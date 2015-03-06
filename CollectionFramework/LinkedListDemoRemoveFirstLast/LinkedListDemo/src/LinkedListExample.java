import java.util.LinkedList;

/*
 * Example of removeFirst() and removeLast() methods
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
		 * Removes and returns the first element from this list.
		 */
		Integer removedFirstElement = linkedList.removeFirst();
		System.out.println("removedFirstElement : " + removedFirstElement);
		System.out.println("linkedList : " + linkedList + "\n");

		/*
		 * Removes and returns the last element from this list.
		 */
		Integer removedLastElement = linkedList.removeLast();
		System.out.println("removedLastElement : " + removedLastElement);
		System.out.println("linkedList : " + linkedList + "\n");

	}
}
