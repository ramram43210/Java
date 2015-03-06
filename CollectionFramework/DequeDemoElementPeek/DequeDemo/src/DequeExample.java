import java.util.Deque;
import java.util.LinkedList;

/*
 *  Example of element() and peek() methods.
 */
public class DequeExample
{

	public static void main(String[] args)
	{
		Deque<Integer> deque = new LinkedList<Integer>();
		deque.add(200);
		deque.add(300);
		deque.add(400);
		deque.add(500);

		System.out.println("deque : " + deque + "\n");

		/*
		 * Retrieves, but does not remove, the head of the queue represented by
		 * this deque (in other words, the first element of this deque). This
		 * method differs from peek only in that it throws an exception if this
		 * deque is empty.
		 */
		Integer element = deque.element();

		System.out.println("element : " + element);
		System.out.println("deque : " + deque + "\n");

		/*
		 * Retrieves, but does not remove, the head of the queue represented by
		 * this deque (in other words, the first element of this deque), or
		 * returns null if this deque is empty.
		 */

		element = deque.peek();
		System.out.println("element : " + element);
		System.out.println("deque : " + deque + "\n");

	}

}
