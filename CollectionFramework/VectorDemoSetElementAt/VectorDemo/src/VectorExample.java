import java.util.Vector;

/*
 *  Example of setElementAt(E obj, int index) method. 
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

		/*
		 * Sets the component at the specified index of this vector to be the
		 * specified object. The previous component at that position is
		 * discarded.
		 */

		vector.setElementAt(1000, 1);

		System.out.println("vector  : " + vector + "\n");

	}
}
