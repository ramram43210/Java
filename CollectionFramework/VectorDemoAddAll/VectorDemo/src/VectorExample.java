import java.util.ArrayList;
import java.util.Vector;

/*
 *  Example of addAll(Collection<? extends E> c) method 
 */
public class VectorExample
{

	public static void main( String[] args )
	{
		Vector<Integer> vector = new Vector<Integer>();

		vector.add(10);
		vector.add(20);
		vector.add(30);

		System.out.println("vector  : " + vector + "\n");

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(400);
		arrayList.add(500);

		System.out.println("arrayList  : " + arrayList + "\n");

		/*
		 * Appends all of the elements in the specified Collection to the end of
		 * this Vector, in the order that they are returned by the specified
		 * Collection's Iterator
		 */
		boolean isAdded = vector.addAll(arrayList);

		System.out.println("isAdded : " + isAdded);
		System.out.println("vector  : " + vector + "\n");

	}
}
