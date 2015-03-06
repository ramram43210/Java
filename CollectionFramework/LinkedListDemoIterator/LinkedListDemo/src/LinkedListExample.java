import java.util.Iterator;
import java.util.LinkedList;

/*
 * Example of how to use Iterator
 */
public class LinkedListExample
{

	public static void main( String[] args )
	{
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(200);
		linkedList.add(300);
		linkedList.add(10000);
		linkedList.add(5000);
		linkedList.add(2000);

		System.out.println("linkedList : " + linkedList + "\n");

		Iterator<Integer> iterator = linkedList.iterator();

		/*
		 * Using Iterator move the cursor in forward direction and get each
		 * element.
		 */

		while( iterator.hasNext() )
		{
			Integer value = iterator.next();
			System.out.println(value);
		}

	}

}
