import java.util.LinkedList;

/*
 * Example of pop() method
 */
public class LinkedListPopExample
{

	public static void main(String[] args)
	{
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(200);
		linkedList.add(300);
		linkedList.add(10000);
		linkedList.add(5000);

		System.out.println("linkedList : " + linkedList + "\n");

		/*
		 * Pops an element from the stack represented by this list. In other
		 * words, removes and returns the first element of this list.
		 */
		Integer value = linkedList.pop();
		System.out.println("pop : Value : " + value);
		System.out.println("linkedList : " + linkedList + "\n");

	}
}
