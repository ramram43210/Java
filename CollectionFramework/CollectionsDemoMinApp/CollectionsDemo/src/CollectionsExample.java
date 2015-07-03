import java.util.ArrayList;
import java.util.Collections;

/*
 *  Example of  
 *  min(Collection<? extends T> coll) method
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
		 * Returns the minimum element of the given collection, according to the
		 * natural ordering of its elements.
		 */

		Integer minElement = Collections.min(arrayList);

		System.out.println("minElement : " + minElement);

	}

}
