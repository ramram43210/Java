import java.util.ArrayList;
import java.util.Collections;

/*
 Method: 

 public static void shuffle(List<?> list)

 Parameters:

 list - the list to be shuffled.

 */

public class CollectionsExample
{

	public static void main(String[] args)
	{

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		arrayList.add(1000);
		arrayList.add(2000);
		arrayList.add(3000);
		arrayList.add(4000);
		arrayList.add(5000);

		System.out.println("Before shuffle , arrayList : " + arrayList + "\n");

		/*
		 * Randomly permutes the specified list using a default source of
		 * randomness.
		 */
		Collections.shuffle(arrayList);

		System.out.println("After shuffle , arrayList : " + arrayList + "\n");

	}

}
