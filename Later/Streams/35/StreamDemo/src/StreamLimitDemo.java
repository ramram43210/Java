import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamLimitDemo
{
	public static void main(String[] args)
	{
		List<Integer> limnumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7,
				8, 9);
		Stream<Integer> limstream = limnumbers.stream().limit(5);
		limstream.forEach(System.out::println);
	}
}