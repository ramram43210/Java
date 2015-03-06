import java.util.Deque;
import java.util.LinkedList;

/*
 *  Example of size() method.
 */
public class DequeExample
{

	public static void main(String[] args)
	{
		Deque<Integer> deque = new LinkedList<Integer>();
		deque.add(2000);
		deque.add(5000);
		deque.add(10000);

		System.out.println("deque : " + deque + "\n");

		/*
		 * Returns the number of elements in this deque.
		 */
		int size = deque.size();
		System.out.println("size : " + size);

	}

}
