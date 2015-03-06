import java.util.Iterator;
import java.util.Vector;

/*
 *  Example of iterator() method. 
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
		 * Returns an iterator over the elements in this list in proper
		 * sequence.
		 */

		Iterator<Integer> iterator = vector.iterator();

		while( iterator.hasNext() )
		{
			Integer value = iterator.next();
			System.out.println(value);
		}

	}
}
