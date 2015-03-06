import java.util.Vector;

/*
 *  Example of add(E e) method 
 */
public class VectorExample
{

	public static void main( String[] args )
	{
		/*
		 * Constructs an empty vector so that its internal data array has size
		 * 10 and its standard capacity increment is zero.
		 */
		Vector<Integer> vector = new Vector<>();

		/*
		 * Appends the specified element to the end of this Vector.
		 */
		vector.add(100);
		vector.add(200);
		vector.add(300);

		System.out.println("vector  : " + vector);

	}
}
