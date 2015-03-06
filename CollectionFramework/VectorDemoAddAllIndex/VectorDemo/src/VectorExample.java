import java.util.ArrayList;
import java.util.Vector;

/*
 *  Example of addAll(int index, Collection<? extends E> c) method 
 */
public class VectorExample
{

	public static void main( String[] args )
	{
		Vector<Integer> vector = new Vector<>();

		vector.add(10);
		vector.add(20);
		vector.add(30);

		System.out.println("vector  : " + vector + "\n");

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(400);
		arrayList.add(500);

		System.out.println("arrayList  : " + arrayList + "\n");

		/*
		 * Inserts all of the elements in the specified Collection into this
		 * Vector at the specified position. Shifts the element currently at
		 * that position (if any) and any subsequent elements to the right
		 * (increases their indices). The new elements will appear in the Vector
		 * in the order that they are returned by the specified Collection's
		 * iterator.
		 */
		boolean isAdded = vector.addAll(2, arrayList);

		System.out.println("isAdded : " + isAdded);
		System.out.println("vector  : " + vector + "\n");

	}
}
