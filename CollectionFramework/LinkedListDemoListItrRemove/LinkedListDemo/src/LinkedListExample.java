import java.util.LinkedList;
import java.util.ListIterator;

/*
 * Example of remove() method of ListIterator
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

		ListIterator<Integer> listIterator = linkedList.listIterator();

		/*
		 * Using ListIterator move the cursor in forward direction and remove
		 * element one by one.
		 */
		while (listIterator.hasNext())
		{

			listIterator.next();
			/*
			 * Removes from the list the last element that was returned by
			 * next() or previous() methods
			 */
			listIterator.remove();

		}

		System.out.println("linkedList : " + linkedList + "\n");

	}

}
