import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

/*
 Method: 

 public static <T> Enumeration<T> enumeration(Collection<T> c)

 Parameters:

 c - the collection for which an enumeration is to be returned.

 Returns:

 an enumeration over the specified collection.

 */

public class CollectionsExample
{

	public static void main(String[] args)
	{

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		arrayList.add(2000);
		arrayList.add(3000);
		arrayList.add(4000);

		System.out.println("arrayList : " + arrayList + "\n");

		/*
		 * Returns an enumeration over the specified collection. 
		 * This provides interoperability with legacy APIs that require 
		 * an enumeration as input.
		 */
		Enumeration<Integer> enumeration = Collections.enumeration(arrayList);

		while (enumeration.hasMoreElements())
		{
			Integer value = enumeration.nextElement();
			System.out.println(value);

		}

	}

}
