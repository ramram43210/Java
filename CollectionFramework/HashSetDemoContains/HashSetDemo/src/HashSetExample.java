import java.util.HashSet;

/*
 * Example of contains(Object o) method.
 */
public class HashSetExample
{
	public static void main( String[] args )
	{
		HashSet<String> hashSet = new HashSet<String>();

		hashSet.add("Dave");
		hashSet.add("Peter");
		hashSet.add("Phil");
		hashSet.add("Rohit");
		hashSet.add("Virat");

		System.out.println("hashSet: " + hashSet + "\n");

		/*
		 * Returns true if this set contains the specified element.
		 */
		boolean isExist = hashSet.contains("Peter");
		System.out.println("is 'Peter' Exist : " + isExist);
		
		isExist = hashSet.contains("Juli");
		System.out.println("is 'Juli' Exist : " + isExist);

	}
}
