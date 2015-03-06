import java.util.LinkedList;
import java.util.ListIterator;

/*
 * Example of add & set methods of ListIterator
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
		 * Using ListIterator move the cursor in forward direction and add
		 * element and replace element.
		 */

		while (listIterator.hasNext())
		{

			int indexPosition = listIterator.nextIndex();
			if (indexPosition == 2)
			{
				/*
				 * Inserts the specified element into the list
				 */
				listIterator.add(70000);
			}
			Integer value = listIterator.next();
			if (value == 500)
			{
				/*
				 * Replaces the last element returned by next() or previous()
				 * with the specified element
				 */
				listIterator.set(90000);
			}

		}

		System.out.println("linkedList : " + linkedList + "\n");

	}

}
