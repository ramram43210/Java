import java.util.Arrays;
import java.util.List;

/**
 * Terminal Operation : count()
 */
public class StreamDemo3
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("Ball", "Dog", "Apple");

		/*
		 * count() operation return the aggregate count for stream data.
		 */
		long count = list.stream().filter((s) -> s.startsWith("B")).count();

		System.out.println(count);
	}

}