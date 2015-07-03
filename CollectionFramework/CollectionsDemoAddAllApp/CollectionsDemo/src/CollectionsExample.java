import java.util.ArrayList;
import java.util.Collections;

/*
 *  Example of addAll(Collection<? super T> c,
 								T... elements) method
 */

public class CollectionsExample
{

	public static void main(String[] args)
	{
		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("Ajay");
		arrayList.add("Vijay");
		arrayList.add("David");

		System.out.println("arrayList : " + arrayList+"\n");

		/*
		 * Adds all of the specified elements to the specified collection.
		 * Elements to be added may be specified individually or as an array
		 * 
		 * Returns: true if the collection changed as a result of the call
		 */
		boolean isAdded = Collections.addAll(arrayList, "Raju", "Karan", "Julia");
		
		System.out.println("isAdded : "+isAdded+"\n");

		System.out.println("arrayList : " + arrayList+"\n");

	}

}
