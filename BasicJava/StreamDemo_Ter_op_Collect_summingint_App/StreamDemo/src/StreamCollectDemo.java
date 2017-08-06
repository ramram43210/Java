import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectDemo
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(5, 5, 10);
		/*
		 * It performs mutable reduction operation with java 8
		 * Collector.
		 */
		int sum = list.stream().collect(Collectors.summingInt(i -> i));
		System.out.println("Sum: " + sum);
	}
}