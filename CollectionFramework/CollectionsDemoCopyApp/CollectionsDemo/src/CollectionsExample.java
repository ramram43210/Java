import java.util.ArrayList;
import java.util.Collections;

/*
 *  Example of  
 *  copy(List<? super T> dest,List<? extends T> src) method
 */

public class CollectionsExample
{

	public static void main(String[] args)
	{

		ArrayList<Integer> sourceList = new ArrayList<Integer>();

		sourceList.add(1000);
		sourceList.add(2000);
		sourceList.add(3000);
		sourceList.add(4000);

		System.out.println("sourceList : " + sourceList + "\n");

		ArrayList<Integer> destinationList = new ArrayList<Integer>();

		destinationList.add(10);
		destinationList.add(20);
		destinationList.add(30);
		destinationList.add(40);

		System.out.println("destinationList : " + destinationList + "\n");

		/*
		 * Copies all of the elements from one list into another. After the
		 * operation, the index of each copied element in the destination list
		 * will be identical to its index in the source list.
		 * 
		 * The destination list must be at least as long as the source list. If
		 * it is longer, the remaining elements in the destination list are
		 * unaffected.
		 */

		Collections.copy(destinationList, sourceList);

		System.out.println("destinationList After Copy: " + destinationList);

	}

}
