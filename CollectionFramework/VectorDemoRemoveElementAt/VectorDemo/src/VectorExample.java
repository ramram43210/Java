import java.util.Vector;

/*
 *  Example of removeElementAt(int index) method. 
 */
public class VectorExample
{
	public static void main( String[] args )
	{
		Vector<Integer> vector = new Vector<Integer>();

		vector.add(50);
		vector.add(100);
		vector.add(150);
		vector.add(200);

		System.out.println("vector  : " + vector + "\n");

		/*
		 * Deletes the component at the specified index. Each component in this
		 * vector with an index greater or equal to the specified index is
		 * shifted downward to have an index one smaller than the value it had
		 * previously. The size of this vector is decreased by 1. 
		 * 
		 * The index must be a value greater than or equal to 0 and less than the current size
		 * of the vector.
		 * 
		 * This method is identical in functionality to the remove(int) method
		 * (which is part of the List interface). Note that the remove method
		 * returns the old value that was stored at the specified position.
		 */

		vector.removeElementAt(2);

		System.out.println("vector  : " + vector + "\n");

	}
}
