import java.util.Vector;

/*
 *  Example of setSize(int newSize) method. 
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

		System.out.println("vector  : " + vector );

		System.out.println("vector size  : " + vector.size() + "\n");

		/*
		 * Sets the size of this vector. If the new size is greater than the
		 * current size, new null items are added to the end of the vector. If
		 * the new size is less than the current size, all components at index
		 * newSize and greater are discarded.
		 */

		vector.setSize(10);
		System.out.println("vector  : " + vector + "\n");

		vector.setSize(2);
		System.out.println("vector  : " + vector + "\n");

	}
}
