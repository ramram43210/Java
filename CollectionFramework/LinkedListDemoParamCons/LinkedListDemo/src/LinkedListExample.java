import java.util.HashSet;
import java.util.LinkedList;

/*
 *  Example of LinkedList(Collection<? extends E> c) Constructor.
 */
public class LinkedListExample
{

	public static void main( String[] args )
	{
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(100);
		hashSet.add(200);
		hashSet.add(300);

		System.out.println("hashSet : " + hashSet);

		/*
		 * Constructs a list containing the elements of the specified
		 * collection, in the order they are returned by the collection's
		 * iterator.
		 */
		LinkedList<Integer> linkedList = new LinkedList<Integer>(hashSet);

		System.out.println("linkedList : " + linkedList);

	}
}
