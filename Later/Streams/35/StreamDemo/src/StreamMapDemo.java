import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMapDemo
{
	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8,
				9);

		/*
		 * The example gets a new stream which all number items are
		 * transformed from Integer to String.
		 */
		Stream<String> stream = numbers.stream()
				.map(i -> i.toString());

		stream.forEach(number -> System.out.println(number));

	}
}