import java.util.Deque;
import java.util.LinkedList;

/*
 *  Example of addFirst(e) and offerFirst(e) methods.
 */
public class DequeExample
{

	public static void main( String[] args )
	{
		Deque<Integer> deque = new LinkedList<Integer>();

		/*
		 * Inserts the specified element into this queue if it is possible to do
		 * so immediately without violating capacity restrictions, returning
		 * true upon success and throwing an IllegalStateException if no space
		 * is currently available.
		 */
		deque.add(100);
		deque.add(200);
		deque.add(300);

		System.out.println("deque : " + deque + "\n");

		/*
		 * Inserts the specified element at the front of this deque if it is
		 * possible to do so immediately without violating capacity
		 * restrictions. When using a capacity-restricted deque, it is generally
		 * preferable to use method offerFirst(E).
		 */
		deque.addFirst(50);

		System.out.println("deque : " + deque + "\n");

		/*
		 * Inserts the specified element at the front of this deque unless it
		 * would violate capacity restrictions. When using a capacity-restricted
		 * deque, this method is generally preferable to the addFirst(E) method,
		 * which can fail to insert an element only by throwing an exception.
		 * Parameters:
		 */
		boolean isAdded = deque.offerFirst(10);
		System.out.println("isAdded : " + isAdded);
		System.out.println("deque : " + deque);

	}
}
