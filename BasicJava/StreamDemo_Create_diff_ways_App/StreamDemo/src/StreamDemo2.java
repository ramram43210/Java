import java.util.stream.Stream;

/**
 * 
 * How to create stream Using Stream.of(arrayOfElements)
 */

public class StreamDemo2
{
	public static void main(String[] args)
	{
		Integer[] integerArray = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Stream<Integer> stream = Stream.of(integerArray);
		stream.forEach(p -> System.out.println(p));
	}
}