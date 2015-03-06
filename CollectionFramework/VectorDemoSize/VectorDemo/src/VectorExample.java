import java.util.Vector;

/*
 *  Example of size() method. 
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
		 * Returns the number of components in this vector.
		 */

		int size = vector.size();

		System.out.println("size  : " + size + "\n");

	}
}
