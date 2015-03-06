import java.util.LinkedList;

/*
 * Example of isEmpty(),clear() and size() methods
 */
public class LinkedListClearEmptySizeExample
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

		int size;
		boolean isEmpty;
		size = linkedList.size();

		System.out.println("size : " + size);

		isEmpty = linkedList.isEmpty();

		System.out.println("isEmpty : " + isEmpty);

		linkedList.clear();

		System.out.println("\nAfter linkedList is cleared :" + linkedList
		        + "\n");

		size = linkedList.size();

		System.out.println("size : " + size);

		isEmpty = linkedList.isEmpty();

		System.out.println("isEmpty : " + isEmpty);

	}

}
