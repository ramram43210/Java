import java.util.ArrayList;
import java.util.Vector;

/*
 *  Example of retainAll(Collection<?> c) method. 
 */
public class VectorExample
{
	public static void main( String[] args )
	{
		Vector<Integer> vector = new Vector<Integer>();

		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);

		System.out.println("vector  : " + vector + "\n");

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(20);
		arrayList.add(40);

		System.out.println("arrayList  : " + arrayList + "\n");

		/*
		 * Retains only the elements in this Vector that are contained in the
		 * specified Collection. In other words, removes from this Vector all of
		 * its elements that are not contained in the specified Collection.
		 */

		boolean isRetained = vector.retainAll(arrayList);

		System.out.println("isRetained  : " + isRetained );
		System.out.println("vector  : " + vector + "\n");

	}
}
