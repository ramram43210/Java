import java.util.Deque;
import java.util.LinkedList;

/*
 *  Example of removeFirst() and pollFirst() methods.
 */
public class DequeExample
{

	public static void main( String[] args )
	{
		Deque<Integer> deque = new LinkedList<Integer>();
		deque.add(100);
		deque.add(200);
		deque.add(300);

		System.out.println("deque : " + deque + "\n");

		/*
		 * Retrieves and removes the first element of this deque. This method
		 * differs from pollFirst only in that it throws an exception if this
		 * deque is empty.
		 */
		Integer removedElement = deque.removeFirst();

		System.out.println("removedElement : " + removedElement);
		System.out.println("deque : " + deque + "\n");

		/*
		 * Retrieves and removes the first element of this deque, or returns
		 * null if this deque is empty.
		 */
		removedElement = deque.pollFirst();
		System.out.println("removedElement : " + removedElement);
		System.out.println("deque : " + deque + "\n");

	}
}
