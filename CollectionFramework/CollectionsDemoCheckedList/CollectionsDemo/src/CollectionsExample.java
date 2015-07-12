import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 Method: 

 public static <E> List<E> checkedList(List<E> list, Class<E> type)

 Parameters:

 list - the list for which a dynamically typesafe view is to be returned
 type - the type of element that list is permitted to hold

 Returns:

 a dynamically typesafe view of the specified list.
 */

public class CollectionsExample
{

	public static void main(String[] args)
	{

		List myList = new ArrayList();
		myList.add("one");
		myList.add("two");
		myList.add("three");
		myList.add("four");

		System.out.println("myList : " + myList + "\n");
		
		/*
		 * Returns a dynamically typesafe view of the specified list.
		 */
		List chkList = Collections.checkedList(myList, String.class);

		System.out.println("Checked list : " + chkList + "\n");

		/*
		 * you can add any type of elements to myList object.
		 */
		myList.add(10);

		System.out.println("myList : " + myList + "\n");

		/*
		 * you cannot add any type of elements to chkList object, doing so
		 * throws ClassCastException.
		 */

		chkList.add(10);
		
		System.out.println("Checked list : " + chkList + "\n");
	}
}
