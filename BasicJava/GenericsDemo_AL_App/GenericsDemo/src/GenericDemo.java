import java.util.ArrayList;
import java.util.Iterator;
/*
 * Example of Generics in Java
 * 
 * Here, we are using the ArrayList class, but you can use any collection
 * class such as ArrayList, LinkedList, HashSet, TreeSet, HashMap,
 * Comparator etc.
 */

public class GenericDemo
{
	public static void main(String[] args)
	{
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Peter");
		arrayList.add("Ram");
		arrayList.add("Juli");
		//arrayList.add(32);//compile time error

		System.out.println(arrayList);
		/*
		 * type casting is not required
		 */
		String stringValue = arrayList.get(0);
		System.out.println("stringValue = " + stringValue + "\n");

		Iterator<String> itr = arrayList.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}