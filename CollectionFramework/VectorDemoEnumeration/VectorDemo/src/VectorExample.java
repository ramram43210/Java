import java.util.Enumeration;
import java.util.Vector;

/*
 *  Example of elements() method. 
 */
public class VectorExample
{
	public static void main(String[] args)
	{
		Vector<Integer> vector = new Vector<Integer>();

		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);

		System.out.println("vector  : " + vector + "\n");

		/*
		 * Returns an enumeration of the components of this vector. The returned
		 * Enumeration object will generate all items in this vector. The first
		 * item generated is the item at index 0, then the item at index 1, and
		 * so on.
		 */

		Enumeration<Integer> enumeration = vector.elements();

		/*
		 * Tests if this enumeration contains more elements.
		 */
		while (enumeration.hasMoreElements())
		{
			/*
			 * Returns the next element of this enumeration if this enumeration
			 * object has at least one more element to provide.
			 */
			Integer value = enumeration.nextElement();
			System.out.println(value);

		}

	}
}
