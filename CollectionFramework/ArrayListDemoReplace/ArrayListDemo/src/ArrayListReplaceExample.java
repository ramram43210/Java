import java.util.ArrayList;

/*
 * Example of set(int index, E element) method
 */
public class ArrayListReplaceExample
{

	public static void main( String[] args )
	{
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Ram");
		arrayList.add("Dave");
		arrayList.add("Peter");
		arrayList.add("Julia");
		arrayList.add("Akram");

		System.out.println("ArrayList : " + arrayList + "\n");

		/*
		 * Replace 4th index String object
		 */

		arrayList.set(4, "Virat Kohli");

		System.out.println("ArrayList after replacing the element at 4th index : "
		        + arrayList + "\n");

	}

}
