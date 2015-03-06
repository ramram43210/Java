import java.util.Vector;

/*
 *  Example of addElement(E obj) method 
 */
public class VectorExample
{

	public static void main( String[] args )
	{
		Vector<Integer> vector = new Vector<Integer>();

		vector.add(100);
		vector.add(200);
		vector.add(300);

		System.out.println("vector  : " + vector + "\n");

		/*
		 * Adds the specified component to the end of this vector, increasing
		 * its size by one. The capacity of this vector is increased if its size
		 * becomes greater than its capacity.
		 */
		vector.addElement(400);

		System.out.println("vector  : " + vector);

	}
}
