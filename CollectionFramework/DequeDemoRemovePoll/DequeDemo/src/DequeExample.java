import java.util.Deque;
import java.util.LinkedList;

/*
 *  Example of remove(),poll() methods.
 */
public class DequeExample
{

	public static void main(String[] args)
	{
		Deque<Integer> deque = new LinkedList<Integer>();
		deque.add(2000);
		deque.add(5000);
		deque.add(10000);
		deque.add(9000);

		System.out.println("deque : " + deque + "\n");

		/*
		 * Retrieves and removes the head of the queue represented by this deque
		 * (in other words, the first element of this deque). This method
		 * differs from poll only in that it throws an exception if this deque
		 * is empty.
		 */
		Integer removedElement = deque.remove();
		System.out.println("removedElement : " + removedElement);
		System.out.println("deque : " + deque + "\n");

		/*
		 * Retrieves and removes the head of the queue represented by this deque
		 * (in other words, the first element of this deque), or returns null if
		 * this deque is empty.
		 */
		removedElement = deque.poll();
		System.out.println("removedElement : " + removedElement);
		System.out.println("deque : " + deque + "\n");

	}

}
