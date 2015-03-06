import java.util.ArrayList;

/*
 * Example of toArray(T[] a) method
 */
public class ArrayListToArrayExample
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

		String[] strArray = new String[arrayList.size()];

		/*
		 * arrayList elements will be copied to StrArray
		 */

		arrayList.toArray(strArray);

		for (String name : strArray)
		{
			System.out.println(name);
		}

	}

}
