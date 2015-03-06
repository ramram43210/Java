import java.util.Vector;

/*
 *  Example of add(int index, E element) method 
 */
public class VectorExample
{

	public static void main(String[] args)
	{
		Vector<Integer> vector = new Vector<Integer>();

		vector.add(100);
		vector.add(200);
		vector.add(300);

		System.out.println("vector  : " + vector + "\n");

		/*
		 * Inserts the specified element at the specified position in this
		 * Vector. Shifts the element currently at that position (if any) and
		 * any subsequent elements to the right (adds one to their indices).
		 */
		vector.add(1, 400);

		System.out.println("vector  : " + vector);

	}
}
