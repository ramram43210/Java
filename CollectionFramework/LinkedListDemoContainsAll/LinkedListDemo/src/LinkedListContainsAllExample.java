import java.util.LinkedList;

/*
 * Example of containsAll(Collection<?> c) method
 */
public class LinkedListContainsAllExample
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

		LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
		linkedList1.add(200);
		linkedList1.add(300);

		System.out.println("linkedList1 : " + linkedList1 + "\n");

		/*
		 * Returns true if this collection contains all of the elements in the
		 * specified collection.
		 */
		boolean isExist = linkedList.containsAll(linkedList1);

		System.out
				.println("Is linkedList1 elements are there in the linkedList : "
						+ isExist + "\n");

		System.out
				.println("#########################################################"
						+ "\n");

		LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
		linkedList2.add(888);
		linkedList2.add(777);

		System.out.println("linkedList2 : " + linkedList2 + "\n");

		isExist = linkedList.containsAll(linkedList2);

		System.out
				.println("Is linkedList2 elements are there in the linkedList : "
						+ isExist);

	}
}
