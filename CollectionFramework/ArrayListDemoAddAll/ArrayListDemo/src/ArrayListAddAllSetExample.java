import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Example of addAll(Collection<? extends E> c) method
 */
public class ArrayListAddAllSetExample
{

	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Dave");
		list.add("Peter");

		System.out.println("List : " + list);

		Set<String> set = new HashSet<String>();
		set.add("Julia");
		set.add("Akram");

		System.out.println("Set : " + set);

		/*
		 * Adding Set collection elements to the list collection
		 */

		list.addAll(set);

		System.out.println("List : " + list);

	}

}
