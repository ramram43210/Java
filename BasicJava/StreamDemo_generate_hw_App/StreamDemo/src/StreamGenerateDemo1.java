import java.util.stream.Stream;

public class StreamGenerateDemo1
{
	public static void main(String[] args)
	{
		String str = "Hello World!";

		/*
		 * generate(): We need to pass Supplier to this method and it
		 * will return an infinite sequential unordered stream. This
		 * is suitable for generating constant streams, streams of
		 * random elements, etc.
		 */

		Stream<String> stream = Stream.generate(str::toString);									 
		stream.forEach(s -> System.out.println(s));
	}
}