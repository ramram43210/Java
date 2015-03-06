import java.util.LinkedHashSet;

/*
 * Example of add(E e) method.
 */
public class LinkedHashSetExample
{
	public static void main( String[] args )
	{
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		
		System.out.println("linkedHashSet: " + linkedHashSet + "\n");

		/*
		 * Adds the specified element to this set if it is not already present.
		 * 
		 * If this set already contains the element, the call leaves the set
		 * unchanged and returns false.
		 */

		boolean isAdded = linkedHashSet.add("Dave");

		System.out.println("isAdded : " + isAdded);
		System.out.println("linkedHashSet: " + linkedHashSet + "\n");	
		
		isAdded = linkedHashSet.add("Dave");

		System.out.println("isAdded : " + isAdded);
		System.out.println("linkedHashSet: " + linkedHashSet);	

	}
}
