import java.util.stream.Stream;

public class StreamGenerateDemo2
{
	public static void main(String[] args)
	{
		String str = "Hello World!";

		/*
		 * generate(): We need to pass Supplier to this method and it
		 * will return an infinite sequential unordered stream. This
		 * is suitable for generating constant streams, streams of
		 * random elements, etc.
		 * 
		 * limit(): We need to pass a max value and it returns the
		 * stream up to the max number of elements.
		 */

		Stream<String> stream = Stream.generate(str::toString)
									  .limit(4);
		stream.forEach(s -> System.out.println(s));
	}
}