import java.util.ArrayList;

/*
 * Example of add(int index, E element) method
 */
public class ArrayListAddIndexBasedExample
{

	public static void main(String[] args)
	{
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Ram");
		arrayList.add("Dave");
		arrayList.add("Peter");

		System.out.println("ArrayList : " + arrayList);

		/*
		 * In Position 2 adding "Stephan"
		 */

		arrayList.add(2, "Stephan");

		System.out.println("ArrayList : " + arrayList);

	 }

}
