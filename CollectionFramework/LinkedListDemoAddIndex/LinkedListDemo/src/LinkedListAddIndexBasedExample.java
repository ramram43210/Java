import java.util.LinkedList;

/*
 * Example of add(int index, E element) method
 */
public class LinkedListAddIndexBasedExample
{

	public static void main( String[] args )
	{
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);

		System.out.println("linkedList : " + linkedList);

		/*
		 * In Position 2 adding 10
		 */

		linkedList.add(2, 10);

		System.out.println("linkedList : " + linkedList);

	}

}
