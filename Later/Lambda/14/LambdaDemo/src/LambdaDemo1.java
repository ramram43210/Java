import java.util.LinkedHashMap;
import java.util.Map;

public class LambdaDemo1
{

	public static void main(String[] args)
	{

		Map<Integer, String> items = new LinkedHashMap<>();
		items.put(1, "Peter");
		items.put(2, "John");
		items.put(3, "Juli");
		items.put(4, "Stephan");

		/*
		 * Normal way to loop a Map.
		 */
		for (Map.Entry<Integer, String> entry : items.entrySet())
		{
			System.out.println("key : " + entry.getKey()
					+ ", value : " + entry.getValue());
		}

		System.out.println("------------------------------------");

		/*
		 * In Java 8, we can loop a Map with forEach + lambda
		 * expression.
		 */
		items.forEach((k, v) -> 
		System.out.println("Item : " + k + " Count : " + v));

	}

}
