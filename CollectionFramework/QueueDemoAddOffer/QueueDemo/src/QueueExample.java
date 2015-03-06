import java.util.LinkedList;
import java.util.Queue;

/*
 *  Example of add(E e) and offer(E e) methods.
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
		 * Inserts the specified element into this queue if it is possible to do
		 * so immediately without violating capacity restrictions, returning
		 * true upon success and throwing an IllegalStateException if no space
		 * is currently available.
		 */
		boolean isAdded = queue.add(600);

		System.out.println("isAdded : " + isAdded);
		System.out.println("queue : " + queue + "\n");

		/*
		 * Inserts the specified element into this queue if it is possible to do
		 * so immediately without violating capacity restrictions. When using a
		 * capacity-restricted queue, this method is generally preferable to
		 * add(E), which can fail to insert an element only by throwing an
		 * exception.
		 */
		isAdded = queue.offer(700);
		System.out.println("isAdded : " + isAdded);
		System.out.println("queue : " + queue + "\n");

	}
}
