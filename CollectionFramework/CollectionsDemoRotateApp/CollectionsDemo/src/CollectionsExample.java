import java.util.ArrayList;
import java.util.Collections;

/*
 Method: 

 public static void rotate(List<?> list,int distance)

 Parameters:

 list - the list to be rotated.
 distance - the distance to rotate the list. There are no constraints on this value; 
 it may be zero, negative, or greater than list.size().

 */

public class CollectionsExample
{

	public static void main(String[] args)
	{

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);

		System.out.println("Before rotate , arrayList : " + arrayList + "\n");

		/*
		 * Rotates the elements in the specified list by the specified distance.
		 */
		Collections.rotate(arrayList, 1);

		System.out.println("After rotate , arrayList : " + arrayList + "\n");

	}

}
