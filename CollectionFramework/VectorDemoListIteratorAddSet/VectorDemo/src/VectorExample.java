import java.util.ListIterator;
import java.util.Vector;

/*
 *  Example of add(E e) and set(E e) methods of ListIterator. 
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

		ListIterator<String> listIterator = vector.listIterator();

		/*
		 * Using ListIterator move the cursor in forward direction and add
		 * element and replace element.
		 */

		while( listIterator.hasNext() )
		{

			int indexPosition = listIterator.nextIndex();
			if( indexPosition == 2 )
			{
				/*
				 * Inserts the specified element into the list
				 */
				listIterator.add("Virat");
			}
			String name = listIterator.next();
			if( name.equalsIgnoreCase("Phil") )
			{
				/*
				 * Replaces the last element returned by next() or previous()
				 * with the specified element
				 */
				listIterator.set("Stephan");
			}

		}

		System.out.println("vector : " + vector);

	}
}
