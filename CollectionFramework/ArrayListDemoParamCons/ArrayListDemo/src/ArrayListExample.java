import java.util.ArrayList;
import java.util.HashSet;

/*
 *  Example of ArrayList(Collection<? extends E> c) Constructor.
 */
public class ArrayListExample
{

	public static void main( String[] args )
	{
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Ram");
		hashSet.add("Dave");
		hashSet.add("Rohit");

		System.out.println("hashSet : " + hashSet);

		/*
		 * Constructs a list containing the elements of the specified
		 * collection, in the order they are returned by the collection's
		 * iterator.
		 */
		ArrayList<String> arrayList = new ArrayList<String>(hashSet);

		System.out.println("arrayList : " + arrayList);

	}
}
