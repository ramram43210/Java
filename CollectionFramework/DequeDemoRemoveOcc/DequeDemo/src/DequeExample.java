import java.util.Deque;
import java.util.LinkedList;

/*
 *  Example of removeFirstOccurrence(Object o) and removeLastOccurrence(Object o) methods.
 */
public class DequeExample
{

	public static void main(String[] args)
	{
		Deque<Integer> deque = new LinkedList<Integer>();
		deque.add(200);
		deque.add(300);
		deque.add(200);
		deque.add(5000);
		deque.add(200);
		deque.add(800);

		System.out.println("deque : " + deque + "\n");

		/*
		 * Removes the first occurrence of the specified element from this
		 * deque. If the deque does not contain the element, it is unchanged.
		 */
		boolean isRemoved = deque.removeFirstOccurrence(200);
		System.out.println("isRemoved : " + isRemoved);
		System.out.println("deque : " + deque + "\n");

		/*
		 * Removes the last occurrence of the specified element from this deque.
		 * If the deque does not contain the element, it is unchanged.
		 */
		isRemoved = deque.removeLastOccurrence(200);
		System.out.println("isRemoved : " + isRemoved);
		System.out.println("deque : " + deque + "\n");

	}

}
