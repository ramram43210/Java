import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
 Method: 

 public static void shuffle(List<?> list,Random rnd)

 Parameters:
 
 list - the list to be shuffled.
 rnd - the source of randomness to use to shuffle the list.

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
		 * Randomly permute the specified list using the specified source of
		 * randomness.
		 */
		Collections.shuffle(arrayList, new Random());

		System.out.println("After shuffle , arrayList : " + arrayList + "\n");

	}

}
