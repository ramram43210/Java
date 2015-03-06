import java.util.Iterator;
import java.util.Vector;

/*
 * Example of Iterator remove() method.
 */
public class VectorExample
{
	public static void main( String[] args )
	{
		Vector<String> vector = new Vector<String>();
		vector.add("Dave");
		vector.add("Peter");
		vector.add("Phil");

		System.out.println("vector : " + vector + "\n");

		Iterator<String> iterator = vector.iterator();

		while( iterator.hasNext() )
		{
			iterator.next();
			/*
			 * Removes from the list the last element that was returned by
			 * next()
			 */
			iterator.remove();
		}

		System.out.println("vector : " + vector + "\n");


	}
}
