import java.util.Arrays;
import java.util.stream.Stream;
/**
 * Generate Streams from Arrays using .stream or Stream.of.
 */
public class StreamDemo1
{
	public static void main(String[] args)
	{
		String[] strArray = { "Apple", "Ball", "Cat", "Dog", "Eagle" };

		// Get Stream using the Arrays.stream
		Stream<String> stream1 = Arrays.stream(strArray);
		stream1.forEach(x -> System.out.println(x));

		System.out.println("---------------------------------");
		
		// Get Stream using the Stream.of
		Stream<String> stream2 = Stream.of(strArray);
		stream2.forEach(x -> System.out.println(x));
	}

}