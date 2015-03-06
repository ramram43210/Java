import java.util.LinkedList;

/*
 * Example of get(int index) method
 */
public class LinkedListGetExample
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
		 * Returns the element at the specified position in this list.
		 */
		
		Integer value = linkedList.get(3);

		System.out.println("Value in the 3rd index : " + value);

	}

}
