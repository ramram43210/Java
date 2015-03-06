import java.util.LinkedList;

/*
 * 
 * Example of addFirst(E e) and addLast(E e) methods
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
		 * Inserts the specified element at the beginning of this list.
		 */
		linkedList.addFirst(90000);

		System.out.println("linkedList : " + linkedList + "\n");

		/*
		 * Appends the specified element to the end of this list.
		 */

		linkedList.addLast(80000);

		System.out.println("linkedList : " + linkedList + "\n");

	}

}
