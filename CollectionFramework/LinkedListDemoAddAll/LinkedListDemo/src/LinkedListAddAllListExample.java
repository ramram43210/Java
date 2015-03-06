import java.util.LinkedList;

/*
 * Example of addAll(Collection<? extends E> c) method
 */
public class LinkedListAddAllListExample
{

	public static void main( String[] args )
	{
		LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
		linkedList1.add(1);
		linkedList1.add(2);
		linkedList1.add(3);

		System.out.println("linkedList1 : " + linkedList1);

		LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
		linkedList2.add(4);
		linkedList2.add(5);

		System.out.println("linkedList2 : " + linkedList2);

		/*
		 * Adding linkedList2 collection elements to the linkedList1 collection
		 */

		linkedList1.addAll(linkedList2);

		System.out.println("linkedList1 : " + linkedList1);
	}

}
