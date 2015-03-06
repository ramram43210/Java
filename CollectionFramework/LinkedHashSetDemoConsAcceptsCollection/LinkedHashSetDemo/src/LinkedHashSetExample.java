import java.util.ArrayList;
import java.util.LinkedHashSet;

/*
 * Example of LinkedHashSet(Collection<? extends E> c) Constructor.
 */
public class LinkedHashSetExample
{
	public static void main( String[] args )
	{
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1000);
		arrayList.add(2000);
		
		System.out.println("arrayList : "+arrayList);

		/*
		 * Constructs a new linked hash set with the same elements as the
		 * specified collection. The linked hash set is created with an initial
		 * capacity sufficient to hold the elements in the specified collection
		 * and the default load factor (0.75).
		 */
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(
				arrayList);

		System.out.println("linkedHashSet : " + linkedHashSet + "\n");

	}
}
