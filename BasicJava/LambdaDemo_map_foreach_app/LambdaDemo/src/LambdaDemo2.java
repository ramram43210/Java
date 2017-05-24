import java.util.LinkedHashMap;
import java.util.Map;

public class LambdaDemo2
{

	public static void main(String[] args)
	{

		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(1, "Peter");
		map.put(2, "John");
		map.put(3, "Juli");
		map.put(4, "Stephan");

		/*
		 * In Java 8, we can loop a Map with forEach + lambda
		 * expression+multiple statements.
		 */

		map.forEach((k, v) -> {
			System.out.println("key : " + k + " value : " + v);
			if ("John".equals(v))
			{
				System.out.println("Hello John");
			}
		});
	}

}
