import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/*
 * Example of addAll(Collection<? extends E> c) method
 */
public class LinkedListAddAllIndexBasedExample
{

	public static void main( String[] args )
	{
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);

		System.out.println("linkedList : " + linkedList);

		Set<Integer> set = new HashSet<Integer>();
		set.add(4);
		set.add(5);

		System.out.println("set : " + set);
		
		/*
		 * In Position 1 adding Set collection elements to the list collection
		 */

		linkedList.addAll(1,set);

		System.out.println("linkedList : " + linkedList);
	}

}
