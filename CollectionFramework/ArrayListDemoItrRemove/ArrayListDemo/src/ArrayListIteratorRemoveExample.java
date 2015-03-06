import java.util.ArrayList;
import java.util.Iterator;

/*
 * Example of Iterator remove() method
 */
public class ArrayListIteratorRemoveExample
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

		Iterator<String> iterator = arrayList.iterator();

		while( iterator.hasNext() )
		{
			iterator.next();
			/*
			 * Removes from the list the last element that was returned by
			 * next()
			 */
			iterator.remove();
		}

		System.out.println("arrayList : " + arrayList + "\n");

	}

}
