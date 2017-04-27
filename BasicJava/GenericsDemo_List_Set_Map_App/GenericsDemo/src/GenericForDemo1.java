import java.util.ArrayList;
import java.util.List;

public class GenericForDemo1
{
	public static void main(String[] args)
	{

		List<String> list = new ArrayList<String>();
		list.add("Peter");
		list.add("Juli");
		list.add("Stephan");

		/*
		 * Java's Generic For Loop or for each loop.
		 */
		for (String aString : list)
		{
			System.out.println(aString);
		}

	}

}