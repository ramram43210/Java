import java.util.ArrayList;
import java.util.Vector;

/*
 *  Example of containsAll(Collection<?> c) method 
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
		arrayList.add(10);
		arrayList.add(30);

		System.out.println("arrayList  : " + arrayList + "\n");

		/*
		 * Returns true if this Vector contains all of the elements in the
		 * specified Collection.
		 */
		boolean isExist = vector.containsAll(arrayList);

		System.out.println("isExist : " + isExist);

	}
}
