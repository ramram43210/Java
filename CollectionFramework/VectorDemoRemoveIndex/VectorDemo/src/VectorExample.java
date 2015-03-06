import java.util.Vector;

/*
 *  Example of remove(int index) method. 
 */
public class VectorExample
{
	public static void main( String[] args )
	{
		Vector<Integer> vector = new Vector<Integer>();

		vector.add(100);
		vector.add(40);
		vector.add(30);
		vector.add(50);

		System.out.println("vector  : " + vector + "\n");

		/*
		 * Removes the element at the specified position in this Vector. Shifts
		 * any subsequent elements to the left (subtracts one from their
		 * indices). Returns the element that was removed from the Vector.
		 */

		Integer removedElement = vector.remove(1);

		System.out.println("removedElement  : " + removedElement);
		System.out.println("vector  : " + vector + "\n");

	}
}
