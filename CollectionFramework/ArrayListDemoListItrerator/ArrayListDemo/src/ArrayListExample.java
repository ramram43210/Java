import java.util.ArrayList;
import java.util.ListIterator;

/*
 * Example of how to use ListIterator
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
		 * Using ListIterator move the cursor in forward direction and get each
		 * element.
		 */

		System.out.println("Forward Direction -----" + "\n");

		while( listIterator.hasNext() )
		{
			int nextIndex = listIterator.nextIndex();
			String name = listIterator.next();
			System.out.println(nextIndex + " : " + name);

		}

		System.out.println("\n" + "##############################" + "\n");

		/*
		 * Using ListIterator move the cursor in reverse direction and get each
		 * element.
		 */

		System.out.println("Reverse Direction -----" + "\n");

		while( listIterator.hasPrevious() )
		{
			int previousIndex = listIterator.previousIndex();
			String name = listIterator.previous();
			System.out.println(previousIndex + " : " + name);
		}

	}

}
