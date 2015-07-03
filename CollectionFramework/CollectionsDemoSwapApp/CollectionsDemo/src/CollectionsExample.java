import java.util.ArrayList;
import java.util.Collections;

/*
 Example of:  

 swap(List<?> list, int i, int j)

 Parameters:

 list - The list in which to swap elements.
 i - the index of one element to be swapped.
 j - the index of the other element to be swapped.

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
		 * Swaps the elements at the specified positions in the specified list.
		 * (If the specified positions are equal, invoking this method leaves
		 * the list unchanged.)
		 */

		Collections.swap(arrayList, 0, 1);

		System.out.println("After Swap , arrayList : " + arrayList + "\n");

	}

}
