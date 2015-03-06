import java.util.LinkedList;
import java.util.ListIterator;

/*
 * Example of how to use ListIterator
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

		ListIterator<Integer> listIterator = linkedList.listIterator();

		/*
		 * Using ListIterator move the cursor in forward direction and get each
		 * element.
		 */

		System.out.println("Forward Direction -----" + "\n");

		while( listIterator.hasNext() )
		{
			int nextIndex = listIterator.nextIndex();
			Integer value = listIterator.next();
			System.out.println(nextIndex + " : " + value);

		}

		System.out.println("\n" + "##############################" + "\n");

		/*
		 * Using ListIterator move the cursor in reverse direction and get each
		 * element.
		 */

		System.out.println("Reverse Direction -----" + "\n");

		while( listIterator.hasPrevious() )
		{
			int previousIndex = listIterator.previousIndex();
			Integer value = listIterator.previous();
			System.out.println(previousIndex + " : " + value);
		}

	}

}
