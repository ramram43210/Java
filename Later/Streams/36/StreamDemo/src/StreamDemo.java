import java.util.stream.Stream;

public class StreamDemo
{
	public static void main(String[] args)
	{
		Stream<String> streamSource = Stream.of("Peter", "Steve",
															"Juli");

		// perform terminal operation by forEach method
		streamSource.forEach(System.out::print);

		// the stream is already closed, so this code will throw
		// exception at runtime
		streamSource.forEach(System.out::print);

	}
}