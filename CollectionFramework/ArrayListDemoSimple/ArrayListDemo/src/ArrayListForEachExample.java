import java.util.ArrayList;
import java.util.List;

public class ArrayListForEachExample
{

	public static void main( String[] args )
	{
		List<String> list = new ArrayList<String>();

		list.add("Ram");
		list.add("Dave");
		list.add("Peter");
		list.add("John");

		/*
		 * Using for-each loop getting each element from the list.
		 */

		for( String name : list )
		{
			System.out.println(name);
		}

	}

}
