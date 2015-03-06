import java.util.ListIterator;
import java.util.Vector;

/*
 *  Example of listIterator() method. 
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

		System.out.println("vector  : " + vector + "\n");

		/*
		 * Returns a list iterator over the elements in this list (in proper
		 * sequence).
		 */

		ListIterator<Integer> listIterator = vector.listIterator();

		System.out.println("Forward direction ---");
		while( listIterator.hasNext() )
		{
			Integer value = listIterator.next();
			System.out.println(value);

		}
		
		System.out.println("\nReverse direction ---");
		while( listIterator.hasPrevious() )
		{
			Integer value = listIterator.previous();
			System.out.println(value);

		}
	}
}
