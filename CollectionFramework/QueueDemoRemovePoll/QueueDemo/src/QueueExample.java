import java.util.LinkedList;
import java.util.Queue;

/*
 *  Example of remove() and poll() methods.
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
		 * Retrieves and removes the head of this queue. This method differs
		 * from poll only in that it throws an exception if this queue is empty.
		 */
		Integer removedElement = queue.remove();

		System.out.println("removedElement : " + removedElement);
		System.out.println("queue : " + queue + "\n");

		/*
		 * Retrieves and removes the head of this queue, or returns null if this
		 * queue is empty.
		 */
		removedElement = queue.poll();
		System.out.println("removedElement : " + removedElement);
		System.out.println("queue : " + queue + "\n");

	}
}
