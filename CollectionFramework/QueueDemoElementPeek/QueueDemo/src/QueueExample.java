import java.util.LinkedList;
import java.util.Queue;

/*
 *  Example of element() and peek() methods.
 */
public class QueueExample
{

	public static void main( String[] args )
	{
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(200);
		queue.add(300);
		queue.add(400);
		queue.add(500);

		System.out.println("queue : " + queue + "\n");

		/*
		 * Retrieves, but does not remove, the head of this queue. This method
		 * differs from peek only in that it throws an exception if this queue
		 * is empty.
		 */
		Integer element = queue.element();

		System.out.println("element : " + element);
		System.out.println("queue : " + queue + "\n");

		/*
		 * Retrieves, but does not remove, the head of this queue, or returns
		 * null if this queue is empty.
		 */

		element = queue.peek();
		System.out.println("element : " + element);
		System.out.println("queue : " + queue + "\n");

	}
}
