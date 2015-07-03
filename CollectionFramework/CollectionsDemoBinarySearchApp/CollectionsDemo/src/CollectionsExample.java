import java.util.ArrayList;
import java.util.Collections;

/*
 *  Example of  
 *  binarySearch(List<? extends Comparable<? super T>> list,T key) method
 */

public class CollectionsExample
{

	public static void main(String[] args)
	{
		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("Ajay");
		arrayList.add("Vijay");
		arrayList.add("David");
		arrayList.add("Raju");
		arrayList.add("Karan");		

		System.out.println("arrayList : " + arrayList+"\n");

		/*
		 * Searches the specified list for the specified object using the binary
		 * search algorithm. The list must be sorted into ascending order
		 * according to the natural ordering of its elements (as by the
		 * sort(List) method) prior to making this call. If it is not sorted,
		 * the results are undefined. If the list contains multiple elements
		 * equal to the specified object, there is no guarantee which one will
		 * be found.
		 * 
		 * Returns: the index of the search key, if it is contained in the list
		 */
		int indexPostion = Collections.binarySearch(arrayList, "Raju");
		
		System.out.println("indexPostion : "+indexPostion+"\n");		

	}

}
