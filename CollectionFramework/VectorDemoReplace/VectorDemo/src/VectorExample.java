import java.util.Vector;

/*
 *  Example of set(int index, E element) method. 
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
		 * Replaces the element at the specified position in this Vector with
		 * the specified element.
		 */

		Integer replacedElement = vector.set(2, 1000);

		System.out.println("replacedElement  : " + replacedElement);
		System.out.println("vector  : " + vector + "\n");

	}
}
