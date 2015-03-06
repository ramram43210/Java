import java.util.Deque;
import java.util.LinkedList;

/*
 *  Example of remove(Object o) method.
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
		 * Removes the first occurrence of the specified element from this
		 * deque. If the deque does not contain the element, it is unchanged.
		 */
		boolean isRemoved = deque.remove(5000);
		System.out.println("isRemoved : " + isRemoved);
		System.out.println("deque : " + deque + "\n");

	}

}
