import java.util.HashMap;
import java.util.Map;

public class GenericForDemo3
{
	public static void main(String[] args)
	{
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Ram");
		map.put(2, "Peter");
		map.put(3, "Juli");

		/*
		 * Java's Generic For Loop or for each loop.
		 */
		for (Integer key : map.keySet())
		{
			String value = map.get(key);
			System.out.println("" + key + ":" + value);
		}

		System.out.println("-------------------------------");

		/*
		 * Java's Generic For Loop or for each loop.
		 */
		for (String value : map.values())
		{
			System.out.println(value);
		}
	}

}