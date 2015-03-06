import java.util.Vector;

/*
 *  Example of trimToSize() method. 
 */
public class VectorExample
{
	public static void main(String[] args)
	{
		Vector<Integer> vector = new Vector<Integer>();

		System.out.println("capacity : " + vector.capacity() + "\n");

		for (int i = 0; i < 12; i++)
		{
			vector.add(i);
		}

		System.out.println("vector : " + vector + "\n");

		System.out.println("size : " + vector.size());
		System.out.println("capacity : " + vector.capacity());

		/*
		 * Trims the capacity of this vector to be the vector's current size. If
		 * the capacity of this vector is larger than its current size, then the
		 * capacity is changed to equal the size by replacing its internal data
		 * array, kept in the field elementData, with a smaller one.
		 * 
		 * An application can use this operation to minimize the storage of a
		 * vector.
		 */
		vector.trimToSize();

		System.out
				.println("After trimToSize : capacity : " + vector.capacity());

	}
}
