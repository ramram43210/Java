import java.util.ArrayList;

/*
 * Example of get(int index) method
 */
public class ArrayListGetExample
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

		String name = arrayList.get(2);

		System.out.println("Value in the 2nd index : " + name);

	}

}
