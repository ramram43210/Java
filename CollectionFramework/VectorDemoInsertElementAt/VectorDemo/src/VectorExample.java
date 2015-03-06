import java.util.Vector;

/*
 *  Example of insertElementAt(E obj, int index) method. 
 */
public class VectorExample
{
	public static void main( String[] args )
	{
		Vector<Integer> vector = new Vector<>();

		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);

		System.out.println("vector  : " + vector + "\n");

		/*
		 * Inserts the specified object as a component in this vector at the
		 * specified index. Each component in this vector with an index greater
		 * or equal to the specified index is shifted upward to have an index
		 * one greater than the value it had previously.
		 */

		vector.insertElementAt(4000, 1);

		System.out.println("vector  : " + vector + "\n");

	}
}
