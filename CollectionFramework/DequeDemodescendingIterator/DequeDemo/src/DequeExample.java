import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/*
 *  Example of descendingIterator() method
 */
public class DequeExample
{

	public static void main(String[] args)
	{
		Deque<Integer> deque = new LinkedList<Integer>();
		deque.add(100);
		deque.add(200);
		deque.add(300);
		deque.add(400);

		System.out.println("deque : " + deque + "\n");

		/*
		 * Returns an iterator over the elements in this deque in reverse
		 * sequential order. The elements will be returned in order from last
		 * (tail) to first (head).
		 */

		Iterator<Integer> iterator = deque.descendingIterator();

		System.out.println("Reverse Direction -- ");

		while (iterator.hasNext())
		{
			Integer value = iterator.next();
			System.out.println(value);
		}

	}

}
