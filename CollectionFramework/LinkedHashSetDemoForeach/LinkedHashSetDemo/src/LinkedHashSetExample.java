import java.util.LinkedHashSet;

/*
 * Example of for-each loop.
 */
public class LinkedHashSetExample
{
	public static void main(String[] args)
	{
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

		linkedHashSet.add("Dave");
		linkedHashSet.add("Peter");
		linkedHashSet.add("Juli");
		linkedHashSet.add("Rohit");
		linkedHashSet.add("Virat");

		System.out.println("linkedHashSet : " + linkedHashSet + "\n");

		/*
		 * Using for-each loop get each element from the LinkedHashSet.
		 */

		for (String name : linkedHashSet)
		{
			System.out.println(name);
		}

	}
}
