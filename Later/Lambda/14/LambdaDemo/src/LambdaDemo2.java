import java.util.LinkedHashMap;
import java.util.Map;

public class LambdaDemo2
{

	public static void main(String[] args)
	{

		Map<Integer, String> items = new LinkedHashMap<>();
		items.put(1, "Peter");
		items.put(2, "John");
		items.put(3, "Juli");
		items.put(4, "Stephan");

		/*
		 * In Java 8, we can loop a Map with forEach + lambda
		 * expression+multiple statements.
		 */

		items.forEach((k, v) -> {
			System.out.println("Item : " + k + " Count : " + v);
			if ("John".equals(v))
			{
				System.out.println("Hello John");
			}
		});
	}

}
