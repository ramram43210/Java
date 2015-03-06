import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

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

		Iterator<Integer> iterator = queue.iterator();
		/*
		 * Using Iterator traverse the queue and get each element.
		 */
		while( iterator.hasNext() )
		{
			Integer value = iterator.next();
			System.out.println(value);
		}

	}
}
