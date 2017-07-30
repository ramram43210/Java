import java.util.stream.Stream;

public class StreamForEachDemo
{
	public static void main(String[] args)
	{
		
		Stream<String> stream = Stream.of("peter", "Juli", "David");
		/*
		 * iterates over each element using forEach:
		 */
		stream.forEach(System.out::println);

	}
}