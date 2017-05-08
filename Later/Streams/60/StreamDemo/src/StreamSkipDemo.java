import java.util.Arrays;

public class StreamSkipDemo
{
	public static void main(String[] args)
	{

		/*
		 * skip(): It returns a stream skipping the given number of
		 * elements.
		 */
		int[] array = { 5, 10, 15, 20 };
		Arrays.stream(array).skip(2)
				.forEach(s -> System.out.println(s + " "));
	}
}