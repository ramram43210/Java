import java.util.ArrayList;
import java.util.List;

/*
 * Example of subList(int fromIndex, int toIndex) methods
 */
public class ArrayListSubListExample
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

		List<String> subList = arrayList.subList(0, 3);

		System.out.println("subList : " + subList + "\n");

	}

}
