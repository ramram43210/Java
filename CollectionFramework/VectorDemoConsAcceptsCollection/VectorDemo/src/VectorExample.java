import java.util.ArrayList;
import java.util.Vector;

/*
 *  Example of Vector(Collection<? extends E> c) Constructor. 
 */
public class VectorExample
{
	public static void main( String[] args )
	{
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Dave");
		arrayList.add("Peter");
		arrayList.add("Phil");

		System.out.println("arrayList : " + arrayList);

		/*
		 * Constructs a vector containing the elements of the specified
		 * collection, in the order they are returned by the collection's
		 * iterator.
		 */
		Vector<String> vector = new Vector<String>(arrayList);

		System.out.println("vector : " + vector);

	}
}
