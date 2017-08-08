import java.util.Arrays;

public class StreamFlatMapDemo2
{
	public static void main(String[] args)
	{
		Integer[][] integerArray = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		/*
		 * Stream.flatMap()
		 *
		 * It returns a stream of object after applying mapping
		 * function on each element and then flattens the result.
		 */
		Arrays.stream(integerArray).flatMap(row -> Arrays.stream(row))
								   .filter(num -> num % 2 == 1)
								   .forEach(s -> System.out.print(s + " "));
	}
}