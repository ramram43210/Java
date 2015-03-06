import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/*
 *  Example of iterator() method.
 */
public class DequeExample
{

	public static void main(String[] args)
	{
		Deque<Integer> deque = new LinkedList<Integer>();
		deque.add(100);
		deque.add(200);
		deque.add(300);

		System.out.println("deque : " + deque + "\n");

		/*
		 * Returns an iterator over the elements in this deque in proper
		 * sequence. The elements will be returned in order from first (head) to
		 * last (tail).
		 */

		Iterator<Integer> iterator = deque.iterator();

		while (iterator.hasNext())
		{
			Integer value = iterator.next();
			System.out.println(value);
		}

	}
}
