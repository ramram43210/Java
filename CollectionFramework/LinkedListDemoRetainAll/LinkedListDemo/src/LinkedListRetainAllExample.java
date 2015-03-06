import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * Example of retainAll(Collection<?> c) method
 */
public class LinkedListRetainAllExample
{

	public static void main( String[] args )
	{
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);

		System.out.println("linkedList : " + linkedList + "\n");

		List<Integer> retainList = new ArrayList<Integer>();
		retainList.add(3);
		retainList.add(4);

		System.out.println("RetainList : " + retainList + "\n");

		/*
		 * Retain group of elements in the linkedList
		 */

		linkedList.retainAll(retainList);

		System.out
		        .println("linkedList After retaining elements which are present in the retainList : "
		                + linkedList + "\n");

	}

}
