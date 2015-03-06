import java.util.ArrayList;
import java.util.List;

/*
 * Example of retainAll(Collection<?> c) method
 */
public class ArrayListRetainAllExample
{

	public static void main( String[] args )
	{
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Ram");
		arrayList.add("Dave");
		arrayList.add("Peter");
		arrayList.add("Julia");
		arrayList.add("Akram");

		System.out.println("ArrayList : " + arrayList + "\n");

		List<String> retainList = new ArrayList<String>();
		retainList.add("Dave");
		retainList.add("Peter");

		System.out.println("RetainList : " + retainList + "\n");

		/*
		 * Retaining group of elements from the list
		 */

		arrayList.retainAll(retainList);

		System.out
		        .println("ArrayList after retaining elements which are present in the retainList : "
		                + arrayList + "\n");

	}

}
