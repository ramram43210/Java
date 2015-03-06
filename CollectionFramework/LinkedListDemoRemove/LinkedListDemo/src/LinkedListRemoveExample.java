import java.util.LinkedList;

/*
 * Example of remove(int index) and remove(Object o) methods
 */
public class LinkedListRemoveExample
{

	public static void main(String[] args)
	{
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Ram");
		linkedList.add("Dave");
		linkedList.add("Peter");
		linkedList.add("Julia");
		linkedList.add("Akram");

		System.out.println("linkedList : " + linkedList + "\n");

		/*
		 * Remove element from the index position 1.
		 */

		linkedList.remove(1);

		System.out
				.println("linkedList After removing element from the index 1 : "
						+ linkedList + "\n");

		/*
		 * Remove the String object Julia.
		 */

		linkedList.remove("Julia");

		System.out
				.println("linkedList After removing String object \"Julia\" : "
						+ linkedList);
	}

}
