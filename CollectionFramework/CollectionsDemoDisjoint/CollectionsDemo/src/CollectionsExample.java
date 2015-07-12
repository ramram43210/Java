import java.util.ArrayList;
import java.util.Collections;

/*
 Example of:  

 disjoint(Collection<?> c1, Collection<?> c2)

 Parameters:

 c1 - a collection
 c2 - a collection

 Returns:

 true if the two specified collections have no elements in common.

 */

public class CollectionsExample
{

	public static void main(String[] args)
	{

		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();

		arrayList1.add(2000);
		arrayList1.add(3000);
		arrayList1.add(4000);

		System.out.println("arrayList1 : " + arrayList1 + "\n");

		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

		arrayList2.add(100);
		arrayList2.add(200);
		arrayList2.add(300);

		System.out.println("arrayList2 : " + arrayList2 + "\n");

		/*
		 * Returns true if the two specified collections have no elements in
		 * common.
		 */

		boolean isNoCommonElement = Collections
				.disjoint(arrayList1, arrayList2);
		
		System.out.println("isNoCommonElement : "+isNoCommonElement);

		if (isNoCommonElement)
		{
			System.out
					.println("No CommonElement exists in arrayList1 and arrayList2 ");
		}
		else
		{
			System.out
					.println("CommonElement exists in arrayList1 and arrayList2 ");
		}

		System.out.println("\n"
				+ "*****************************************************"
				+ "\n");

		ArrayList<Integer> arrayList3 = new ArrayList<Integer>();

		arrayList3.add(10);
		arrayList3.add(20);
		arrayList3.add(30);

		System.out.println("arrayList3 : " + arrayList3 + "\n");

		ArrayList<Integer> arrayList4 = new ArrayList<Integer>();

		arrayList4.add(1000);
		arrayList4.add(1001);
		arrayList4.add(10);

		System.out.println("arrayList4 : " + arrayList4 + "\n");

		isNoCommonElement = Collections.disjoint(arrayList3, arrayList4);
		
		System.out.println("isNoCommonElement : "+isNoCommonElement);

		if (isNoCommonElement)
		{
			System.out
					.println("No CommonElement exists in arrayList3 and arrayList4 ");
		}
		else
		{
			System.out
					.println("CommonElement exists in arrayList3 and arrayList4 ");
		}

	}

}
