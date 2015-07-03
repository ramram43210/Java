import java.util.ArrayList;
import java.util.Collections;

/*
 Method: 

 public static int lastIndexOfSubList(List<?> source, List<?> target)

 Parameters:

 source - the list in which to search for the last occurrence of target.
 target - the list to search for as a subList of source.

 Returns:

 the starting position of the last occurrence of the specified target list 
 within the specified source list, or -1 if there is no such occurrence.
 */

public class CollectionsExample
{

	public static void main(String[] args)
	{

		ArrayList<Integer> sourceList = new ArrayList<Integer>();

		sourceList.add(2000);
		sourceList.add(3000);
		sourceList.add(4000);
		sourceList.add(5000);
		sourceList.add(6000);
		sourceList.add(4000);
		sourceList.add(5000);
		sourceList.add(6000);

		System.out.println("sourceList : " + sourceList + "\n");

		ArrayList<Integer> targetList = new ArrayList<Integer>();

		targetList.add(4000);
		targetList.add(5000);

		System.out.println("targetList : " + targetList + "\n");

		/*
		 * Returns the starting position of the last occurrence of the specified
		 * target list within the specified source list, or -1 if there is no
		 * such occurrence.
		 */
		int indexPostion = Collections.lastIndexOfSubList(sourceList,
				targetList);

		System.out.println("indexPostion : " + indexPostion);

	}

}
