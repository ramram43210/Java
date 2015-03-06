import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * Example of removeAll(Collection<?> c) method
 */
public class LinkedListRemoveAllExample
{

	public static void main(String[] args)
	{
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Ram");
		linkedList.add("Dave");
		linkedList.add("Peter");
		linkedList.add("Julia");
		linkedList.add("Akram");

		System.out.println("linkedList : " + linkedList + "\n");

		List<String> removeList = new ArrayList<String>();
		removeList.add("Dave");
		removeList.add("Peter");

		System.out.println("RemoveList : " + removeList + "\n");

		/*
		 * Remove group of elements from the linkedList
		 */

		linkedList.removeAll(removeList);

		System.out
				.println("linkedList After removing elements which are present in the removeList : "
						+ linkedList + "\n");

	}

}
