import java.util.Vector;

/*
 *  Example of toArray() method. 
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
		 * Returns an array containing all of the elements in this Vector in the
		 * correct order.
		 */

		Object[] objArray = vector.toArray();

		for( Object object : objArray )
		{
			Integer value = (Integer) object;
			System.out.println(value);
		}

	}
}
