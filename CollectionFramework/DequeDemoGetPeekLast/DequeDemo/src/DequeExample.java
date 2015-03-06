import java.util.Deque;
import java.util.LinkedList;

/*
 *  Example of getLast() and peekLast() methods.
 */
public class DequeExample
{

	public static void main( String[] args )
	{
		Deque<Integer> deque = new LinkedList<Integer>();
		deque.add(100);
		deque.add(200);
		deque.add(300);
		deque.add(400);

		System.out.println("deque : " + deque + "\n");

		/*
		 * Retrieves, but does not remove, the last element of this deque. This
		 * method differs from peekLast only in that it throws an exception if
		 * this deque is empty.
		 */
		Integer element = deque.getLast();

		System.out.println("element : " + element);
		System.out.println("deque : " + deque + "\n");

		/*
		 * Retrieves, but does not remove, the last element of this deque, or
		 * returns null if this deque is empty.
		 */
		element = deque.peekLast();
		System.out.println("element : " + element);
		System.out.println("deque : " + deque + "\n");

	}
}
