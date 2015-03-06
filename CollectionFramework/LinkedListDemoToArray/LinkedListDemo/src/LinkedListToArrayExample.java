import java.util.LinkedList;

/*
 * Example of toArray(T[] a) methods
 */
public class LinkedListToArrayExample
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

		Integer[] integerArray = new Integer[linkedList.size()];

		/*
		 * linkedList elements will be copied to IntegerArray
		 */

		linkedList.toArray(integerArray);

		/*
		 * Get value from the integerArray using for loop
		 */
		System.out.println("Array elemtents are ---");
		for (Integer value : integerArray)
		{
			System.out.println(value);
		}

	}

}
