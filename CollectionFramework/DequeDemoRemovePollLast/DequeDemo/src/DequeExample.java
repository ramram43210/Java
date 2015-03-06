import java.util.Deque;
import java.util.LinkedList;

/*
 *  Example of removeLast() and pollLast() methods.
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
		 * Retrieves and removes the last element of this deque. This method
		 * differs from pollLast only in that it throws an exception if this
		 * deque is empty.
		 */
		Integer removedElement = deque.removeLast();

		System.out.println("removedElement : " + removedElement);
		System.out.println("deque : " + deque + "\n");

		/*
		 * Retrieves and removes the last element of this deque, or returns null
		 * if this deque is empty.
		 */
		removedElement = deque.pollLast();
		System.out.println("removedElement : " + removedElement);
		System.out.println("deque : " + deque + "\n");

	}
}
