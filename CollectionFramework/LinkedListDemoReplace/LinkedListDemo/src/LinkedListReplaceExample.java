import java.util.LinkedList;

/*
 * Example of set(int index, E element) method
 */
public class LinkedListReplaceExample
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

		/*
		 * Replace 1st index Integer object
		 */

		linkedList.set(1, 20000);

		System.out.println("linkedList After replacing the element at 1st index : "
		        + linkedList + "\n");

	}

}
