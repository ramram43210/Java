import java.util.Collections;
import java.util.HashSet;

/*
 *  Example of addAll(Collection<? super T> c,
 									T... elements) method
 */

public class CollectionsExample
{

	public static void main(String[] args)
	{
		HashSet<String> hashSet = new HashSet<String>();

		hashSet.add("Ajay");
		hashSet.add("Vijay");
		hashSet.add("David");

		System.out.println("hashSet : " + hashSet + "\n");

		String[] namesArray =
		{ "Ajay", "Karan", "Julia" };

		/*
		 * Adds all of the specified elements to the specified collection.
		 * Elements to be added may be specified individually or as an array
		 * 
		 * Returns: true if the collection changed as a result of the call
		 */
		boolean isAdded = Collections.addAll(hashSet, namesArray);

		System.out.println("isAdded : " + isAdded + "\n");

		System.out.println("hashSet : " + hashSet + "\n");
	}

}
