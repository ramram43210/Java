import java.util.Deque;
import java.util.LinkedList;

/*
 *  Example of addLast(E e) and offerLast(E e) methods.
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
		 * Inserts the specified element at the end of this deque if it is
		 * possible to do so immediately without violating capacity
		 * restrictions. When using a capacity-restricted deque, it is generally
		 * preferable to use method offerLast(E).
		 */
		deque.addLast(50);

		System.out.println("deque : " + deque + "\n");

		/*
		 * Inserts the specified element at the end of this deque unless it
		 * would violate capacity restrictions. When using a capacity-restricted
		 * deque, this method is generally preferable to the addLast(E) method,
		 * which can fail to insert an element only by throwing an exception.
		 */
		boolean isAdded = deque.offerLast(10);
		System.out.println("isAdded : " + isAdded);
		System.out.println("deque : " + deque);

	}
}
