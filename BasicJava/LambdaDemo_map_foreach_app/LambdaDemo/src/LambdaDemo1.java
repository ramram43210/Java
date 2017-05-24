import java.util.LinkedHashMap;
import java.util.Map;

public class LambdaDemo1
{

	public static void main(String[] args)
	{

		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(1, "Peter");
		map.put(2, "John");
		map.put(3, "Juli");
		map.put(4, "Stephan");

		/*
		 * Normal way to loop a Map.Before Java 8
		 */
		for (Map.Entry<Integer, String> entry : map.entrySet())
		{
			System.out.println("key : " + entry.getKey() + ", value : "
					                                       + entry.getValue());
		}

		System.out.println("------------------------------------");

		/*
		 * In Java 8, we can loop a Map with forEach + lambda expression.
		 */
		map.forEach((k, v) -> System.out.println("key : " + k + " value : " + v));

	}

}
