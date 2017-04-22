import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamSortDemo
{
	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(8, 9, 2, 5, 3, 4, 5, 6, 6);
		Stream<Integer> stream = numbers.stream().sorted();
		stream.forEach(System.out::println);
	}
}