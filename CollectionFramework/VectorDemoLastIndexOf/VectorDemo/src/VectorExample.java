import java.util.Vector;

/*
 *  Example of lastIndexOf(Object o) method. 
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
		 * Returns the index of the last occurrence of the specified element in
		 * this vector, or -1 if this vector does not contain the element.
		 */

		int indexPosition = vector.lastIndexOf(30);

		System.out.println("indexPosition  : " + indexPosition + "\n");

	}
}
