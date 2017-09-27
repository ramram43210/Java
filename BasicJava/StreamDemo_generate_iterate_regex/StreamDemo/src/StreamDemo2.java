import java.util.stream.Stream;
/**
 * Generate Stream using Stream.iterate().
 */
public class StreamDemo2
{
	public static void main(String[] args)
	{
		Stream<Long> iterateNumbers = Stream.iterate(1L, n -> n + 10).limit(5);
		iterateNumbers.forEach(System.out::println);
	}

}