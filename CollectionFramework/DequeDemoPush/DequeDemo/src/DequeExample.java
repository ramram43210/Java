import java.util.Deque;
import java.util.LinkedList;

/*
 *  Example of push(E e) method.
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
		 * Pushes an element onto the stack represented by this deque (in other
		 * words, at the head of this deque)
		 */
		deque.push(100);
		System.out.println("deque : " + deque + "\n");

	}

}
