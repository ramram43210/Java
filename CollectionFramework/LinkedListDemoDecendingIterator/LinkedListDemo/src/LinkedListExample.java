import java.util.Iterator;
import java.util.LinkedList;

/*
 * Example of descendingIterator() method
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
		 * Returns an iterator over the elements in this deque in reverse
		 * sequential order. The elements will be returned in order from last
		 * (tail) to first (head).
		 */

		Iterator<Integer> iterator = linkedList.descendingIterator();

		System.out.println("Reverse Direction -- ");

		while (iterator.hasNext())
		{
			Integer value = iterator.next();
			System.out.println(value);
		}

	}

}
