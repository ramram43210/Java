import java.util.Arrays;
import java.util.List;

/**
 * Terminal operation : match()
 */
public class StreamDemo1
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("Ball", "Cat", "Dog", "Apple");

		/*
		 * match() operation returns a boolean depending upon the condition
		 * applied on stream data.
		 */
		boolean result = list.stream().anyMatch((s) -> s.startsWith("D"));
		System.out.println(result);
	}
}