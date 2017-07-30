import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDistinctDemo
{
	public static void main(String[] args)
	{
		List<Integer> numberList = Arrays.asList(1, 1, 2, 3, 3, 4, 5,6, 6);
		/*
		 * Returns a stream consisting of the distinct elements
		 * (according to Object.equals(Object)) of this stream.
		 */
		Stream<Integer> stream = numberList.stream().distinct();
		stream.forEach(System.out::println);
	}
}