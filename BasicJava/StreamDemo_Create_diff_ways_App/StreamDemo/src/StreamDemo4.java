import java.util.Date;
import java.util.stream.Stream;

/**
 * 
 * How to create stream Using Stream.generate() or Stream.iterate()
 * functions
 */

public class StreamDemo4
{
	public static void main(String[] args)
	{
		Stream<Date> stream = Stream.generate(() -> {return new Date();	});
		stream.forEach(p -> System.out.println(p));
	}
}