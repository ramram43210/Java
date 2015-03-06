import java.util.LinkedList;

/*
 * Example of contains(Object o) method
 */
public class LinkedListContainsExample
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

		boolean isExist;

		/*
		 * Returns true if this list contains the specified element.
		 */
		isExist = linkedList.contains(5000);

		System.out.println("Is 5000 exist :  " + isExist);

		isExist = linkedList.contains(9000);

		System.out.println("Is 9000 exist :  " + isExist);

	}

}
