import java.util.ArrayList;
import java.util.Collections;

/*
 *  Example of  
 *  
 *		replaceAll(List<T> list,T oldVal,T newVal) method
 *   
 *  Parameters:  
 *  
 *  	list - the list in which replacement is to occur.
 *		oldVal - the old value to be replaced.
 *		newVal - the new value with which oldVal is to be replaced.	
 *
 *	Returns:
 *
 *		true if old values are replaced with new values.
 *  
 */
public class CollectionsExample
{

	public static void main(String[] args)
	{

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		arrayList.add(2000);
		arrayList.add(3000);
		arrayList.add(4000);
		arrayList.add(1000);
		arrayList.add(2000);
		arrayList.add(2000);

		System.out.println("arrayList : " + arrayList + "\n");

		/*
		 * Replaces all occurrences of one specified value in a list with
		 * another.
		 */

		boolean isReplaced = Collections.replaceAll(arrayList, 2000, 10);

		System.out.println("isReplaced : " + isReplaced + "\n");
		
		System.out.println("After Replaced , arrayList : " + arrayList);

	}

}
