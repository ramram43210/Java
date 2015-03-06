import java.util.Vector;

/*
 *  Example of  contains(Object o) method 
 */
public class VectorExample
{

	public static void main(String[] args)
	{
		Vector<Integer> vector = new Vector<Integer>();

		vector.add(10);
		vector.add(20);
		vector.add(30);

		System.out.println("vector  : " + vector + "\n");

		/*
		 * Returns true if this vector contains the specified element
		 */
		boolean isExist = vector.contains(20);

		System.out.println("is '20' Exist in vector : " + isExist + "\n");

		isExist = vector.contains(500);

		System.out.println("is '500' Exist in vector : " + isExist);

	}
}
