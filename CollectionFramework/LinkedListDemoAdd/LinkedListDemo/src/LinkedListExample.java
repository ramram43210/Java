import java.util.LinkedList;
/*
 * Example of add(E e) method.
 */
public class LinkedListExample
{

	public static void main( String[] args )
	{
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		/*
		 * Appends the specified element to the end of this list.
		 */
		linkedList.add(100);
		linkedList.add(200);
		linkedList.add(300);
		linkedList.add(400);

		System.out.println("linkedList : "+linkedList);
	}

}
