import java.util.LinkedList;
import java.util.List;

/*
 * Example of subList(int fromIndex, int toIndex) method
 */
public class LinkedListSubListExample
{

	public static void main(String[] args)
	{
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(200);
		linkedList.add(300);
		linkedList.add(10000);
		linkedList.add(5000);
		linkedList.add(2000);

		System.out.println("linkedList : " + linkedList + "\n");

		/*
		 * Returns a view of the portion of this list between the specified
		 * fromIndex, inclusive, and toIndex, exclusive. (If fromIndex and
		 * toIndex are equal, the returned list is empty.) The returned list is
		 * backed by this list, so non-structural changes in the returned list
		 * are reflected in this list, and vice-versa. The returned list
		 * supports all of the optional list operations supported by this list.
		 */
		List<Integer> subList = linkedList.subList(0, 3);

		System.out.println("subList : " + subList + "\n");

	}

}
