import java.util.LinkedList;

/*
 * Example of push() method
 */
public class LinkedListPushExample
{

	public static void main( String[] args )
	{
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(200);
		linkedList.add(300);
		linkedList.add(10000);
		linkedList.add(5000);
		
		System.out.println("linkedList : " + linkedList + "\n");

		/*
		 * Pushes an element onto the stack represented by this list. In other
		 * words, inserts the element at the front of this list.
		 */
		linkedList.push(100);
		System.out.println("linkedList : " + linkedList + "\n");

	}
}
