import java.util.ArrayList;
import java.util.ListIterator;

/*
 * Example of listIterator(int index) method
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

		ListIterator<String> listIterator = arrayList.listIterator(2);

		/*
		 * Using ListIterator move the cursor in forward direction and get each
		 * element.
		 */

		System.out.println("Forward Direction -----" + "\n");

		while (listIterator.hasNext())
		{
			int nextIndex = listIterator.nextIndex();
			String name = listIterator.next();
			System.out.println(nextIndex + " : " + name);

		}

	}

}
