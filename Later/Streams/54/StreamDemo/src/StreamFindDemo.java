import java.util.Arrays;

public class StreamForEachDemo
{
	public static void main(String[] args)
	{
		Integer[] data = { 1, 2, 3, 4, 5, 6, 7 };

		/*
		 * forEach(): It performs an action on each element of stream.
		 */
		Arrays.stream(data).filter(num -> num % 2 == 1)
				.forEach(s -> System.out.print(s + " "));
	}
}