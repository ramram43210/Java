import java.util.List;
import java.util.Vector;

/*
 *  Example of subList(int fromIndex,int toIndex) method. 
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
		vector.add(60);
		vector.add(70);

		System.out.println("vector  : " + vector + "\n");

		/*
		 * Returns a view of the portion of this List between fromIndex,
		 * inclusive, and toIndex, exclusive. (If fromIndex and toIndex are
		 * equal, the returned List is empty.)
		 * 
		 * The returned List is backed by this List, so changes in the returned
		 * List are reflected in this List, and vice-versa. The returned List
		 * supports all of the optional List operations supported by this List.
		 */

		List<Integer> subList = vector.subList(1, 4);
		System.out.println("subList  : " + subList + "\n");

	}
}
