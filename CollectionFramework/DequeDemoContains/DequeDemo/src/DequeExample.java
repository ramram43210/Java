import java.util.Deque;
import java.util.LinkedList;

/*
 *  Example of contains(Object o) method.
 */
public class DequeExample
{

	public static void main(String[] args)
	{
		Deque<Integer> deque = new LinkedList<Integer>();
		deque.add(200);
		deque.add(300);
		deque.add(200);

		System.out.println("deque : " + deque + "\n");

		/*
		 * Returns true if this deque contains the specified element.
		 */
		boolean isExist = deque.contains(300);
		System.out.println("is 300 Exist :  " + isExist);

		isExist = deque.contains(10000);
		System.out.println("is 10000 Exist : " + isExist);

	}

}
