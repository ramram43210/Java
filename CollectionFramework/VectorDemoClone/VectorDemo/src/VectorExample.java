import java.util.Vector;

/*
 *  Example of clone() method 
 */
public class VectorExample
{

	public static void main( String[] args )
	{
		Vector<Integer> vector = new Vector<Integer>();

		vector.add(10);
		vector.add(20);
		vector.add(30);

		System.out.println("vector  : " + vector);

		/*
		 * Returns a clone of this vector. The copy will contain a reference to
		 * a clone of the internal data array, not a reference to the original
		 * internal data array of this Vector object.
		 */
		Object object = vector.clone();
		Vector<Integer> clonedVector = (Vector<Integer>) object;

		System.out.println("clonedVector  : " + clonedVector);

	}
}
