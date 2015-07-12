import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/*
 Method: 

 public static <T> Queue<T> asLifoQueue(Deque<T> deque)

 Parameters:

 deque - the deque

 Returns:

 the queue

 */

public class CollectionsExample
{

	public static void main(String[] args)
	{

		Deque<Integer> deque = new LinkedList<Integer>();
		deque.add(100);
		deque.add(200);
		deque.add(300);
		deque.add(400);

		System.out.println("deque : " + deque+"\n");
		
		/*
		 * Returns a view of a Deque as a Last-in-first-out (Lifo) Queue.
		 */
		Queue<Integer> queue = Collections.asLifoQueue(deque);

		System.out.println("queue : " + queue);

	}
}
