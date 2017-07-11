import java.util.stream.Stream;

/**
 * 
 * We can use stream to iterate any number of times. Stream provides
 * predefined methods to deal with the logic you implement.
 * 
 */
public class StreamDemo1
{
	public static void main(String[] args)
	{
		Stream.iterate(1, element -> element + 1)
				.forEach(System.out::println);
	}
}