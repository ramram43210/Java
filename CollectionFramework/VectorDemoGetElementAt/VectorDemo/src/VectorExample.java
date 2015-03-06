import java.util.Vector;

/*
 *  Example of elementAt(int index),get(int index) methods. 
 */
public class VectorExample
{

	public static void main( String[] args )
	{
		Vector<Integer> vector = new Vector<Integer>();

		vector.add(10);
		vector.add(20);
		vector.add(30);

		System.out.println("vector  : " + vector + "\n");

		/*
		 * Returns the component at the specified index.
		 * 
		 * This method is identical in functionality to the get(int) method
		 * (which is part of the List interface).
		 */

		Integer value = vector.elementAt(1);

		System.out.println("elementAt method : value : " + value);

		/*
		 * Returns the element at the specified position in this Vector.
		 */
		value = vector.get(1);

		System.out.println("get method : value : " + value);

	}
}
