import java.util.Vector;

/*
 *  Example of capacity() method 
 */
public class VectorExample
{

	public static void main(String[] args)
	{
		Vector<Integer> vector = new Vector<Integer>();

		System.out.println("vector  : " + vector);
		System.out.println("vector size : " + vector.size());

		/*
		 * Returns the current capacity of this vector.
		 */
		int capacity = vector.capacity();

		System.out.println("capacity  : " + capacity + "\n");

		for (int i = 0; i < 11; i++)
		{
			vector.add(i+1);
		}

		System.out.println("vector  : " + vector);
		System.out.println("vector size : " + vector.size());

		capacity = vector.capacity();
		System.out.println("capacity  : " + capacity + "\n");
		
		int j = vector.size()+1;
		for (int i = 0; i < 11; i++)
		{
			vector.add(i+j);
		}

		System.out.println("vector  : " + vector);
		System.out.println("vector size : " + vector.size());

		capacity = vector.capacity();
		System.out.println("capacity  : " + capacity + "\n");

	}
}
