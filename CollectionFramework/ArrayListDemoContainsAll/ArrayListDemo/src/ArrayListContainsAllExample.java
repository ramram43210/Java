import java.util.ArrayList;

/*
 * Example of containsAll(Collection<?> c) method
 */
public class ArrayListContainsAllExample
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

		ArrayList<String> arrayList1 = new ArrayList<String>();
		arrayList1.add("Ram");
		arrayList1.add("Julia");

		System.out.println("ArrayList1 : " + arrayList1 + "\n");

		boolean isExist=arrayList.containsAll(arrayList1);
		
		System.out.println("Is ArrayList1 elements are there in ArrayList : "
		        + isExist + "\n");

		System.out
		        .println("#########################################################"
		                + "\n");

		ArrayList<String> arrayList2 = new ArrayList<String>();
		arrayList2.add("Ram");
		arrayList2.add("Raju");

		System.out.println("ArrayList2 : " + arrayList2 + "\n");
		
		isExist =arrayList.containsAll(arrayList2);
		
		System.out.println("Is ArrayList2 elements are there in ArrayList : "
		        +isExist );

	}
}
