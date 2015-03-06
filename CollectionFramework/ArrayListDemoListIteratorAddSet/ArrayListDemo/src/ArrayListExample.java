import java.util.ArrayList;
import java.util.ListIterator;

/*
 * Example of add(E e) and set(E e) methods of ListIterator
 */
public class ArrayListExample
{

	public static void main( String[] args )
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
		 * Using ListIterator move the cursor in forward direction and add
		 * element and replace element.
		 */

		while( listIterator.hasNext() )
		{

			int indexPosition = listIterator.nextIndex();
			if( indexPosition == 2 )
			{
				/*
				 * Inserts the specified element into the list
				 */
				listIterator.add("Virat");
			}
			String name = listIterator.next();
			if( name.equalsIgnoreCase("Ram") )
			{
				/*
				 * Replaces the last element returned by next() or previous()
				 * with the specified element
				 */
				listIterator.set("Stephan");
			}

		}

		System.out.println("List : " + arrayList + "\n");

	}

}
