import java.util.ArrayList;

/*
 * Example of isEmpty(),clear() and size() methods
 */
public class ArrayListClearEmptySizeExample
{

	public static void main(String[] args)
	{
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Ram");
		arrayList.add("Dave");
		arrayList.add("Peter");
		arrayList.add("Julia");
		arrayList.add("Akram");

		System.out.println("arrayList : " + arrayList );

		int size;
		boolean isEmpty;
		size = arrayList.size();

		System.out.println("size : " + size);

		isEmpty = arrayList.isEmpty();

		System.out.println("isEmpty : " + isEmpty);

		arrayList.clear();

		System.out.println("\nAfter list is cleared :" + arrayList );

		size = arrayList.size();

		System.out.println("size : " + size);

		isEmpty = arrayList.isEmpty();

		System.out.println("isEmpty : " + isEmpty);

	}

}
