import java.util.ArrayList;
import java.util.List;

/*
 * Example of removeAll(Collection<?> c) method
 */
public class ArrayListRemoveAllExample
{

	public static void main(String[] args)
	{
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Ram");
		arrayList.add("Dave");
		arrayList.add("Peter");
		arrayList.add("Julia");
		arrayList.add("Akram");

		System.out.println("ArrayList : " + arrayList + "\n");

		List<String> removeList = new ArrayList<String>();
		removeList.add("Dave");
		removeList.add("Peter");

		System.out.println("RemoveList : " + removeList + "\n");

		/*
		 * Remove group of elements from the list
		 */

		arrayList.removeAll(removeList);

		System.out
				.println("ArrayList after removing elements which are present in the removeList : "
						+ arrayList + "\n");

	}

}
