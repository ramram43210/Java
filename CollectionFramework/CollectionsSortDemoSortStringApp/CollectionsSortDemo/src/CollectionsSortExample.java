import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortExample
{

	public static void main(String[] args)
	{
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Dog");
		arrayList.add("Ball");
		arrayList.add("Cat");
		arrayList.add("Apple");

		System.out.println("Before Sorting  : " + arrayList + "\n");

		/*
		 * Sorts the specified list into ascending order, according to the
		 * natural ordering of its elements.
		 * 
		 * All elements in the list must implement the Comparable interface.
		 */
		Collections.sort(arrayList);

		System.out.println("After Sorting   : " + arrayList);

	}

}
