import java.util.Vector;

/*
 *  Example of removeElement(Object obj) method. 
 */
public class VectorExample
{
	public static void main( String[] args )
	{
		Vector<Integer> vector = new Vector<Integer>();

		vector.add(100);
		vector.add(200);
		vector.add(300);
		vector.add(400);

		System.out.println("vector  : " + vector + "\n");

		/*
		 * Removes the first (lowest-indexed) occurrence of the argument from
		 * this vector. If the object is found in this vector, each component in
		 * the vector with an index greater or equal to the object's index is
		 * shifted downward to have an index one smaller than the value it had
		 * previously. 
		 * 
		 * This method is identical in functionality to the
		 * remove(Object) method (which is part of the List interface).
		 */

		Integer element = 300;
		boolean isRemoved = vector.removeElement(element);

		System.out.println("isRemoved  : " + isRemoved);
		System.out.println("vector  : " + vector + "\n");

	}
}
