import java.util.ArrayList;
import java.util.Collections;

/*
 *  Example of  
 *  fill(List<? super T> list,T obj) method
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

		System.out.println("arrayList : " + arrayList + "\n");

		/*
		 * Replaces all of the elements of the specified list with the specified
		 * element.
		 */

		Collections.fill(arrayList,20);

		System.out.println("After fill with '20', arrayList : " + arrayList);

	}

}
