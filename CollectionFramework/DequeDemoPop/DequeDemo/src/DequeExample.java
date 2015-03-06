import java.util.Deque;
import java.util.LinkedList;

/*
 *  Example of pop() method.
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
		 * Pops an element from the stack represented by this deque. In other
		 * words, removes and returns the first element of this deque.
		 */
		Integer value = deque.pop();
		System.out.println("pop : Value : " + value);
		System.out.println("deque : " + deque + "\n");

	}

}
