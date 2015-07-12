import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 Example of:  

 Method:

 emptyList() 

 Returns:

 an empty immutable list.
------------------------------
 Method:

 emptySet()

 Returns:

 the empty set.
-----------------------------
 Method:

 emptyMap()

 Returns:

 the empty map

 */

public class CollectionsExample
{

	public static void main(String[] args)
	{

		/*
		 * Returns an empty list (immutable).
		 */
		List<String> emptyList = Collections.emptyList();
		System.out.println("emptyList : " + emptyList);

		/*
		 * Returns an empty set (immutable).
		 */
		Set<String> emptySet = Collections.emptySet();
		System.out.println("emptySet : " + emptySet);

		/*
		 * Returns an empty map (immutable).
		 */
		Map<String, String> emptyMap = Collections.emptyMap();
		System.out.println("emptyMap : " + emptyMap);

	}

}
