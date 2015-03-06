import java.util.LinkedList;

/*
 * Example of element() method
 */
public class LinkedListExample
{

	public static void main(String[] args)
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

		Integer value = linkedList.element();
		System.out.println(value);

		System.out.println("\nAfter calling element method :  linkedList : "
				+ linkedList + "\n");

	}

}
