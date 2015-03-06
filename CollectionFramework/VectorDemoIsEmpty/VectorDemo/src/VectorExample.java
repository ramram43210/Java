import java.util.Vector;

/*
 *  Example of isEmpty() method. 
 */
public class VectorExample
{
	public static void main( String[] args )
	{
		Vector<Integer> vector = new Vector<Integer>();

		System.out.println("vector  : " + vector);

		/*
		 * Tests if this vector has no components.
		 */

		boolean isEmpty = vector.isEmpty();

		System.out.println("isEmpty  : " + isEmpty + "\n");

		vector.add(10);
		vector.add(20);

		System.out.println("vector  : " + vector);

		/*
		 * Tests if this vector has no components.
		 */

		isEmpty = vector.isEmpty();

		System.out.println("isEmpty  : " + isEmpty + "\n");

	}
}
