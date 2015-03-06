import java.util.ArrayList;

/*
 * Example of remove(int index) and remove(Object o) method
 */
public class ArrayListRemoveExample
{

	public static void main(String[] args)
	{
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Ram");
		arrayList.add("Dave");
		arrayList.add("Peter");
		arrayList.add("Julia");
		arrayList.add("Akram");

		System.out.println("ArrayList : " + arrayList + "\n");

		/*
		 * Remove element from the index position 1.
		 */

		arrayList.remove(1);

		System.out.println("ArrayList after removing element from the index 1 : "
				+ arrayList + "\n");

		/*
		 * Remove the String object Julia.
		 */

		arrayList.remove("Julia");

		System.out.println("ArrayList after removing String object \"Julia\" : "
				+ arrayList);
	}

}
