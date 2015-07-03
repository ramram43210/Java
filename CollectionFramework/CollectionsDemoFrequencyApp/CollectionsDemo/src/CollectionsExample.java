import java.util.ArrayList;
import java.util.Collections;

/*
 *  Example of  
 *  frequency(Collection<?> c,Object o) method
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
		arrayList.add(2000);
		arrayList.add(2000);

		System.out.println("arrayList : " + arrayList + "\n");

		/*
		 * Returns the number of elements in the specified collection equal to
		 * the specified object.
		 */

		int frequency = Collections.frequency(arrayList, 2000);

		System.out.println("frequency : " + frequency);

	}

}
