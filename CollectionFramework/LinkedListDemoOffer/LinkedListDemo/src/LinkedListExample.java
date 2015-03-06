import java.util.LinkedList;

/*
 * Example of offer(E e),offerFirst(E e) and offerLast(E e) methods
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

		/*
		 * Adds the specified element as the tail (last element) of this list.
		 */
		boolean isAdded = linkedList.offer(4000);
		System.out.println("isAdded : "+ isAdded);
		System.out.println("After calling offer(4000) Method : linkedList : " + linkedList + "\n");
		
		/*
		 * Inserts the specified element at the front of this list.
		 */
		isAdded = linkedList.offerFirst(100);
		System.out.println("isAdded : "+ isAdded);
		System.out.println("After calling offerFirst(100) Method : linkedList : " + linkedList + "\n");

		/*
		 * Inserts the specified element at the end of this list.
		 */
		isAdded = linkedList.offerLast(6000);
		System.out.println("isAdded : "+ isAdded);
		System.out.println("After calling offerLast(6000) Method : linkedList : " + linkedList + "\n");

	}
}
