import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilterDemo
{
	public static void main(String[] args)
	{
		List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8,9);
		/*
		 * The example gets a new stream with even numbers from list
		 * of numbers:
		 */
		Stream<Integer> stream = numberList.stream()
										   .filter(i -> (i % 2) == 0);

		stream.forEach(number -> System.out.println(number));

	}
}