import java.util.Vector;

/*
 *  Example of firstElement(), lastElement() method. 
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
		vector.add(50);

		System.out.println("vector  : " + vector + "\n");

		/*
		 * Returns the first component (the item at index 0) of this vector.
		 */

		Integer firstElement = vector.firstElement();
		System.out.println("firstElement : " + firstElement);

		/*
		 * Returns the last component of the vector.
		 */
		Integer lastElement = vector.lastElement();
		System.out.println("lastElement : " + lastElement);

	}
}
