import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo
{
	public static void main(String[] args)
	{
		List<String> nameList = Arrays.asList("Peter", "Steve", "Juli");
		
		Stream<String> stream = nameList.stream();

		// perform terminal operation by forEach method
		stream.forEach(System.out::println);

		// the stream is already closed, so this code will throw
		// exception at runtime
		stream.forEach(System.out::print);

	}
}