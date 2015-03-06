import java.util.LinkedList;

public class LinkedListForEachExample
{

	public static void main( String[] args )
	{
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		linkedList.add(100);
		linkedList.add(200);
		linkedList.add(300);
		linkedList.add(400);

		/*
		 * Using for-each loop getting each element from the linkedList.
		 */

		for( Integer value : linkedList )
		{
			System.out.println(value);
		}

	}

}
