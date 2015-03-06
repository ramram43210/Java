import java.util.Vector;

/*
 *  Example of removeAllElements() method. 
 */
public class VectorExample
{
	public static void main( String[] args )
	{
		Vector<Integer> vector = new Vector<Integer>();

		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);

		System.out.println("vector  : " + vector + "\n");

		/*
		 * Removes all components from this vector and sets its size to zero.
		 * 
		 * This method is identical in functionality to the clear() method
		 * (which is part of the List interface).
		 */

		vector.removeAllElements();

		System.out.println("vector  : " + vector + "\n");

	}
}
