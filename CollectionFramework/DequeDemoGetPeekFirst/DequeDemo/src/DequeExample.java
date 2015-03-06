import java.util.Deque;
import java.util.LinkedList;

/*
 *  Example of getFirst() and peekFirst() methods.
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
		 * Retrieves, but does not remove, the first element of this deque. This
		 * method differs from peekFirst only in that it throws an exception if
		 * this deque is empty.
		 */
		Integer element = deque.getFirst();

		System.out.println("element : " + element);
		System.out.println("deque : " + deque + "\n");

		/*
		 * Retrieves, but does not remove, the first element of this deque, or
		 * returns null if this deque is empty.
		 */
		element = deque.peekFirst();
		System.out.println("element : " + element);
		System.out.println("deque : " + deque + "\n");

	}
}
