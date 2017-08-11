import java.util.Arrays;

public class StreamSkipDemo
{
	public static void main(String[] args)
	{

		/*
		 * skip(): It returns a stream skipping the given number of
		 * elements.
		 */
		int[] intArray = { 5, 10, 15, 20 };
		Arrays.stream(intArray).skip(2).forEach(s -> System.out.println(s + " "));
	}
}