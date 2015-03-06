import java.util.LinkedHashSet;

/*
 * Example of contains(Object o) method.
 */
public class LinkedHashSetExample
{
	public static void main( String[] args )
	{
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

		linkedHashSet.add("Dave");
		linkedHashSet.add("Peter");
		linkedHashSet.add("Phil");
		linkedHashSet.add("Rohit");
		linkedHashSet.add("Virat");

		System.out.println("linkedHashSet: " + linkedHashSet + "\n");

		/*
		 * Returns true if this set contains the specified element.
		 */
		boolean isExist = linkedHashSet.contains("Peter");
		System.out.println("is 'Peter' Exist : " + isExist);
		
		isExist = linkedHashSet.contains("Juli");
		System.out.println("is 'Juli' Exist : " + isExist);

	}
}
