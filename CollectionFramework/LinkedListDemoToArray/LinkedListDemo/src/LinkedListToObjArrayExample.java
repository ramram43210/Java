import java.util.LinkedList;

/*
 * Example of toArray() method
 */
public class LinkedListToObjArrayExample
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
		 * Returns an array containing all of the elements in this list in
		 * proper sequence (from first to last element).
		 */

		Object[] objArray = linkedList.toArray();
		System.out.println("Array elemtents are ---");
		for( Object object : objArray )
		{
			Integer value = (Integer) object;
			System.out.println(value);
		}

	}
}
