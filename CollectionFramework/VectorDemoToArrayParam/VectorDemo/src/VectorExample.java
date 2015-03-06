import java.util.Vector;

/*
 *  Example of toArray(T[] a) method. 
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
		 * Returns an array containing all of the elements in this Vector in the
		 * correct order; the runtime type of the returned array is that of the
		 * specified array. If the Vector fits in the specified array, it is
		 * returned therein. Otherwise, a new array is allocated with the
		 * runtime type of the specified array and the size of this Vector.
		 * 
		 * If the Vector fits in the specified array with room to spare (i.e.,
		 * the array has more elements than the Vector), the element in the
		 * array immediately following the end of the Vector is set to null.
		 * (This is useful in determining the length of the Vector only if the
		 * caller knows that the Vector does not contain any null elements.)
		 */

		integerArray = vector.toArray(integerArray);

		for( Integer value : integerArray )
		{
			System.out.println(value);
		}

	}
}
