import java.util.HashSet;
import java.util.Set;

public class GenericForDemo2
{
	public static void main(String[] args)
	{

		Set<Integer> set = new HashSet<Integer>();
		set.add(100);
		set.add(200);
		set.add(300);

		/*
		 * Java's Generic For Loop or for each loop.
		 */
		for (Integer integerValue : set)
		{
			System.out.println(integerValue);
		}

	}

}