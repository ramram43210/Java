import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListForLoopIteratorExample
{

	public static void main( String[] args )
	{
		List<String> list = new ArrayList<String>();

		list.add("Ram");
		list.add("Dave");
		list.add("Peter");
		list.add("John");

		/*
		 * Using Iterator to get each element from the list.
		 */

		for( Iterator<String> iterator = list.iterator(); iterator.hasNext(); )
		{
			String name = iterator.next();
			System.out.println(name);
		}

	}

}
