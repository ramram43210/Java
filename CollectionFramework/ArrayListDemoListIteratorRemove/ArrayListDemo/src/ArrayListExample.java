import java.util.ArrayList;
import java.util.ListIterator;

/*
 * Example of remove() method of ListIterator
 */
public class ArrayListExample
{

	public static void main(String[] args)
	{
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Ram");
		arrayList.add("Dave");
		arrayList.add("Peter");
		arrayList.add("Julia");
		arrayList.add("Akram");

		System.out.println("arrayList : " + arrayList + "\n");

		ListIterator<String> listIterator = arrayList.listIterator();

		/*
		 * Using ListIterator move the cursor in forward direction and remove
		 * element one by one.
		 */

		while (listIterator.hasNext())
		{

			listIterator.next();
			/*
			 * Removes from the list the last element that was returned by
			 * next() or previous() methods
			 */
			listIterator.remove();

		}

		System.out.println("arrayList : " + arrayList + "\n");

	}

}
