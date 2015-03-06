import java.util.ArrayList;

/*
 * Example of indexOf(Object o) and lastIndexOf(Object o) methods
 */
public class ArrayListIndexOfExample
{

	public static void main( String[] args )
	{
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Ram");
		arrayList.add("Dave");
		arrayList.add("Julia");
		arrayList.add("Dave");
		arrayList.add("Akram");
		arrayList.add("Dave");
		arrayList.add("Steve");
		

		System.out.println("ArrayList : " + arrayList + "\n");

		int index;
		
		index = arrayList.indexOf("Julia");

		System.out.println("Index position of 'Julia' : " + index);
		
		index = arrayList.indexOf("Dave");

		System.out.println("Index position of 'Dave' using indexOf method : " + index);
		
		
		index = arrayList.lastIndexOf("Dave");

		System.out.println("Index position of 'Dave' using lastIndexOf method : " + index);

	}

}
