import java.util.ArrayList;

/*
 * Example of addAll(Collection<? extends E> c) method
 */
public class ArrayListAddAllListExample
{

	public static void main(String[] args)
	{
		ArrayList<String> arrayList1 = new ArrayList<String>();
		arrayList1.add("Ram");
		arrayList1.add("Dave");
		arrayList1.add("Peter");

		System.out.println("arrayList 1 : " + arrayList1);

		ArrayList<String> ArrayList2 = new ArrayList<String>();
		ArrayList2.add("Julia");
		ArrayList2.add("Akram");

		System.out.println("ArrayList 2 : " + ArrayList2);

		/*
		 * Adding ArrayList2 collection elements to the arrayList1 collection
		 */

		arrayList1.addAll(ArrayList2);

		System.out
				.println("After adding ArrayList2 collection elements to the arrayList1 collection ");

		System.out.println("arrayList 1 : " + arrayList1);

	}

}
