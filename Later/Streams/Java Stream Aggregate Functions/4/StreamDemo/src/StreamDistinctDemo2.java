import java.util.Arrays;

public class StreamDistinctDemo2
{
	public static void main(String[] args)
	{
		int[] numbers = { 10, 10, 20, 20, 20 };

		/*
		 * The following code returns a stream of distinct numbers from an
		 * array source
		 */
		Arrays.stream(numbers).distinct()
				.forEach(i -> System.out.print(i + " "));
	}

}