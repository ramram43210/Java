import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDistinctDemo
{
	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 6,
				6);
		Stream<Integer> stream = numbers.stream().distinct();
		stream.forEach(System.out::println);
	}
}