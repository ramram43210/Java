import java.util.Collections;
import java.util.List;

/*
 Method: 

 public static <T> List<T> nCopies(int n,T o)

 Parameters:

 n - the number of elements in the returned list.
 o - the element to appear repeatedly in the returned list.

 Returns:

 an immutable list consisting of n copies of the specified object.

 */

public class CollectionsExample
{

	public static void main(String[] args)
	{

		/*
		 * Returns an immutable list consisting of n copies of the specified
		 * object.
		 */
		List<String> list = Collections.nCopies(5, "Ram");

		System.out.println("list : " + list);
		
		/*We cann't add elements in the Immutable List */
		
		list.add("Peter");

	}

}
