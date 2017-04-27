import java.util.HashSet;
import java.util.Iterator;

public class GenericDemo
{
	public static void main(String[] args)
	{
		HashSet<String> nameSet = new HashSet<String>();
		nameSet.add("Peter");
		nameSet.add("John");
		nameSet.add("Juli");

		System.out.println("----------Using for-each loop---------------");
		/*
		 * Using for-each loop we can loop and get each name from nameSet
		 */
		for (String name : nameSet)
		{
			System.out.println(name);
		}

		System.out.println("----------Using Iterator---------------------");
		Iterator<String> iterator = nameSet.iterator();

		while (iterator.hasNext())
		{
			String name = iterator.next();
			System.out.println(name);
		}

	}

}