import java.util.Vector;

/*
 *  Example of clear() method 
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

		/*
		 * Removes all of the elements from this Vector. The Vector will be
		 * empty after this call returns (unless it throws an exception).
		 */
		vector.clear();

		System.out.println("vector  : " + vector + "\n");

	}
}
