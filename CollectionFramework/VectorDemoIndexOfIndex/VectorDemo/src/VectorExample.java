import java.util.Vector;

/*
 *  Example of indexOf(Object o,int index) method. 
 */
public class VectorExample
{
	public static void main( String[] args )
	{
		Vector<Integer> vector = new Vector<Integer>();

		vector.add(10);
		vector.add(30);
		vector.add(30);
		vector.add(40);
		vector.add(30);
		vector.add(50);
		vector.add(30);

		System.out.println("vector  : " + vector + "\n");

		/*
		 * Returns the index of the first occurrence of the specified element in
		 * this vector, searching forwards from index, or returns -1 if the
		 * element is not found.
		 */

		int indexPosition = vector.indexOf(30, 3);

		System.out.println("indexPosition  : " + indexPosition + "\n");

	}
}
