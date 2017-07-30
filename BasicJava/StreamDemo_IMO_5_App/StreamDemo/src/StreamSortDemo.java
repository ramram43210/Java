import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamSortDemo
{
	public static void main(String[] args)
	{
		List<Integer> numberList = Arrays.asList(8, 9, 2, 5, 3, 4, 1, 7, 6);
		/*
		 * Returns a stream consisting of the elements of this stream,
		 * sorted according to natural order. If the elements of this
		 * stream are not Comparable, a java.lang.ClassCastException
		 * may be thrown when the terminal operation is executed.
		 */
		Stream<Integer> stream = numberList.stream().sorted();
		stream.forEach(System.out::println);
	}
}