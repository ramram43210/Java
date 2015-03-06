import java.util.Vector;

/*
 *  Example of remove(Object o) method. 
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
		 * Removes the first occurrence of the specified element in this Vector
		 * If the Vector does not contain the element, it is unchanged.
		 */

		Integer element = 30;
		boolean isRemoved = vector.remove(element);

		System.out.println("isRemoved  : " + isRemoved);
		System.out.println("vector  : " + vector + "\n");

	}
}
