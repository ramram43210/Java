import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamLimitDemo
{
	public static void main(String[] args)
	{
		List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		/*
		 * Returns a stream consisting of the elements of this stream,
		 * truncated to be no longer than maxSize in length
		 */
		Stream<Integer> limstream = numberList.stream().limit(5);
		limstream.forEach(System.out::println);
	}
}