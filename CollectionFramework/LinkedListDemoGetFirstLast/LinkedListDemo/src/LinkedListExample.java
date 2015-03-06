import java.util.LinkedList;

/*
 * Example of getFirst() and getLast() methods
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
		 * Returns the first element in this list.
		 */

		Integer firstElement = linkedList.getFirst();
		System.out.println("firstElement :" + firstElement);

		/*
		 * Returns the last element in this list.
		 */

		Integer lastElement = linkedList.getLast();
		System.out.println("lastElement :" + lastElement);

	}

}
