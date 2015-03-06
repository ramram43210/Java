import java.util.Vector;

/*
 *  Example of copyInto(Object[] anArray) method. 
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

		Integer[] integerArray = new Integer[vector.size()];

		/*
		 * Copies the components of this vector into the specified array
		 */

		vector.copyInto(integerArray);

		for( Integer value : integerArray )
		{
			System.out.println(value);
		}

	}
}
