import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListWhileLoopIteratorExample
{

	public static void main( String[] args )
	{
		List<String> list = new ArrayList<String>();

		list.add("Ram");
		list.add("Dave");
		list.add("Peter");
		list.add("John");

		Iterator<String> iterator = list.iterator();

		/*
		 * Using Iterator to get each element from the list.
		 */
		while( iterator.hasNext() )
		{
			String name = iterator.next();
			System.out.println(name);
		}

	}

}
