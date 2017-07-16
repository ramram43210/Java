import java.util.stream.Stream;

/**
 * 
 * How to create stream Using Stream.of(val1, val2, val3….)
 */

public class StreamDemo1
{
	public static void main(String[] args)
	{
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		stream.forEach(p -> System.out.println(p));
	}
}