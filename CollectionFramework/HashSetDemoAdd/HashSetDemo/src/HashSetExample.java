import java.util.HashSet;

/*
 * Example of add(E e) method.
 */
public class HashSetExample
{
	public static void main( String[] args )
	{
		HashSet<String> hashSet = new HashSet<String>();
		
		System.out.println("hashSet: " + hashSet + "\n");

		/*
		 * Adds the specified element to this set if it is not already present.
		 * 
		 * If this set already contains the element, the call leaves the set
		 * unchanged and returns false.
		 */

		boolean isAdded = hashSet.add("Dave");

		System.out.println("isAdded : " + isAdded);
		System.out.println("hashSet: " + hashSet + "\n");	
		
		isAdded = hashSet.add("Dave");

		System.out.println("isAdded : " + isAdded);
		System.out.println("hashSet: " + hashSet);	

	}
}
