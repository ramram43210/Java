import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Example of Java Generics using Map 
 */
public class GenericDemo
{
	public static void main(String[] args)
	{
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Peter");
		map.put(2, "Stephan");
		map.put(3, "Sara");

		Set<Map.Entry<Integer, String>> set = map.entrySet();

		Iterator<Map.Entry<Integer, String>> itr = set.iterator();
		while (itr.hasNext())
		{
			// no need to typecast
			Map.Entry<Integer, String> e = itr.next();
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
}