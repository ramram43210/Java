import java.util.LinkedList;
import java.util.ListIterator;

/*
 * Example of listIterator(int index) method
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
		linkedList.add(8000);

		System.out.println("linkedList : " + linkedList + "\n");

		/*
		 * Returns a list-iterator of the elements in this list (in proper
		 * sequence), starting at the specified position in the list.
		 */

		ListIterator<Integer> listIterator = linkedList.listIterator(2);

		while (listIterator.hasNext())
		{
			Integer value = listIterator.next();
			System.out.println(value);

		}

	}

}
