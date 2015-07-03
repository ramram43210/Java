import java.util.ArrayList;
import java.util.Collections;

/*
 *  Example of  
 *  reverse(List<?> list) method
 */

public class CollectionsExample
{

	public static void main(String[] args)
	{

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		arrayList.add(2000);
		arrayList.add(3000);
		arrayList.add(4000);
		arrayList.add(1000);

		System.out.println("Before reverse the arrayList : " + arrayList + "\n");

		/*
		 * Reverses the order of the elements in the specified list.
		 */

		Collections.reverse(arrayList);

		System.out.println("After reverse the arrayList : " + arrayList);

	}

}
