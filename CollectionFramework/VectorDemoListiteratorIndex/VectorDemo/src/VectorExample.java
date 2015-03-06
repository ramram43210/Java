import java.util.ListIterator;
import java.util.Scanner;
import java.util.Vector;

/*
 *  Example of listIterator(int index) method. 
 */
public class VectorExample
{
	public static void main( String[] args )
	{
		Scanner scanner = new Scanner(System.in);
		System.out
		        .println("To move forward direction enter 'f' . To move reverse direction enter 'r'");
		String direction = scanner.next();
		scanner.close();

		Vector<Integer> vector = new Vector<>();

		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);

		System.out.println("vector  : " + vector + "\n");

		/*
		 * Returns a list iterator over the elements in this list (in proper
		 * sequence), starting at the specified position in the list. The
		 * specified index indicates the first element that would be returned by
		 * an initial call to next. An initial call to previous would return the
		 * element with the specified index minus one.
		 */

		ListIterator<Integer> listIterator = vector.listIterator(2);

		if( direction.equalsIgnoreCase("f") )
		{
			System.out.println("Forward direction ---");
			while( listIterator.hasNext() )
			{
				Integer value = listIterator.next();
				System.out.println(value);

			}
		}
		else if( direction.equalsIgnoreCase("r") )
		{
			System.out.println("Reverse direction ---");
			while( listIterator.hasPrevious() )
			{
				Integer value = listIterator.previous();
				System.out.println(value);

			}
		}
		else
		{
			System.out.println("Please enter 'f' or 'r'");
		}

	}
}
