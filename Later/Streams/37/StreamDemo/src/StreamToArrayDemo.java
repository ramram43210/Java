import java.util.stream.Stream;

public class StreamForEachDemo
{
	public static void main(String[] args)
	{
		/*
		 * iterates over each element using forEach:
		 */
		Stream.of("peter", "Juli", "David")
				.forEach(System.out::println);

	}
}