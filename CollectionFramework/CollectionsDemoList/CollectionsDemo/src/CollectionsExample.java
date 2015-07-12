import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

/*
 Method: 

 public static <T> ArrayList<T> list(Enumeration<T> e)

 Parameters:

 e - enumeration providing elements for the returned array list

 Returns:

 an array list containing the elements returned by the specified enumeration.
 */

public class CollectionsExample
{

	public static void main(String[] args)
	{

		Vector<Integer> vector = new Vector<Integer>();

		vector.add(2000);
		vector.add(3000);
		vector.add(4000);
		vector.add(5000);
		vector.add(6000);

		System.out.println("vector : " + vector + "\n");

		/*
		 * Returns an enumeration of the components of this vector
		 */
		Enumeration<Integer> enumeration = vector.elements();

		/*
		 * Returns an array list containing the elements returned by the
		 * specified enumeration in the order they are returned by the
		 * enumeration.
		 */
		ArrayList<Integer> arrayList = Collections.list(enumeration);

		System.out.println("arrayList : " + arrayList);

	}

}
