import java.util.Iterator;
import java.util.LinkedList;

/*
 * Example of remove() method of Iterator
 */
public class LinkedListExample
{

	public static void main(String[] args)
	{
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(100);
		linkedList.add(200);
		linkedList.add(300);
		linkedList.add(400);
		linkedList.add(500);

		System.out.println("linkedList : " + linkedList + "\n");

		Iterator<Integer> iterator = linkedList.iterator();

		/*
		 * Using Iterator move the cursor in forward direction and remove
		 * element one by one.
		 */

		while (iterator.hasNext())
		{

			iterator.next();
			/*
			 * Removes from the list the last element that was returned by
			 * next() method
			 */
			iterator.remove();

		}

		System.out.println("linkedList : " + linkedList + "\n");

	}

}
