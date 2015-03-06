import java.util.Vector;

/*
 *  Example of indexOf(Object o) method. 
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
		vector.add(30);
		vector.add(50);

		System.out.println("vector  : " + vector + "\n");

		/*
		 * Returns the index of the first occurrence of the specified element in
		 * this vector, or -1 if this vector does not contain the element.
		 */

		int indexPosition = vector.indexOf(30);

		System.out.println("indexPosition  : " + indexPosition + "\n");

	}
}
