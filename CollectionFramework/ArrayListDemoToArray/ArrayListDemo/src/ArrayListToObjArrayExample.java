import java.util.ArrayList;

/*
 * Example of toArray() method
 */
public class ArrayListToObjArrayExample
{

	public static void main( String[] args )
	{
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Ram");
		arrayList.add("Dave");
		arrayList.add("Peter");
		arrayList.add("Julia");
		arrayList.add("Akram");

		System.out.println("arrayList : " + arrayList + "\n");

		/*
		 * Returns an array containing all of the elements in this list in
		 * proper sequence (from first to last element).
		 */

		Object[] objArray = arrayList.toArray();

		for( Object object : objArray )
		{
			String name = (String) object;
			System.out.println(name);
		}

	}

}
