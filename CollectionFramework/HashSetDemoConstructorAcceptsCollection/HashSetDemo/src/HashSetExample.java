import java.util.HashSet;
import java.util.LinkedList;

/*
 * Example of HashSet(Collection<? extends E> c) Constructor.
 */
public class HashSetExample
{
	public static void main( String[] args )
	{
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1000);
		linkedList.add(2000);
		
		System.out.println("linkedList : "+linkedList);

		/*
		 * Constructs a new set containing the elements in the specified
		 * collection. The HashMap is created with default load factor (0.75)
		 * and an initial capacity sufficient to contain the elements in the
		 * specified collection.
		 */
		HashSet<Integer> hashSet = new HashSet<Integer>(linkedList);

		System.out.println("hashSet : " + hashSet + "\n");

	}
}
