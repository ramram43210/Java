import java.util.ArrayList;

/*
 * Example of contains(Object o) method
 */
public class ArrayListContainsExample
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

		boolean isExist;

		isExist = arrayList.contains("Ram");

		System.out.println("Is 'Ram' exist :  " + isExist);

		isExist = arrayList.contains("Karthick");

		System.out.println("Is 'Karthick' exist :  " + isExist);

	}

}
