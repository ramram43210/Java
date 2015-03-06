import java.util.LinkedList;

/*
 * Example of indexOf(Object o) and lastIndexOf(Object o) methods
 */
public class LinkedListIndexOfExample
{

	public static void main(String[] args)
	{
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(200);
		linkedList.add(300);
		linkedList.add(10000);
		linkedList.add(300);
		linkedList.add(5000);
		linkedList.add(2000);

		System.out.println("linkedList : " + linkedList + "\n");

		int index;

		/*
		 * Returns the index of the first occurrence of the specified element in
		 * this list, or -1 if this list does not contain the element.
		 */
		index = linkedList.indexOf(10000);

		System.out.println("Index position of 10000 : " + index);

		index = linkedList.indexOf(300);

		System.out.println("Index position of 300 using indexOf method : "
				+ index);

		/*
		 * Returns the index of the last occurrence of the specified element in
		 * this list, or -1 if this list does not contain the element.
		 */
		index = linkedList.lastIndexOf(300);

		System.out.println("Index position of 300 using lastIndexOf method : "
				+ index);

	}

}
