import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Convert Streams to Other DataStructures
 * 
 * Get Collections using stream.collect(Collectors.toList()).
 */
public class StreamDemo1
{
	public static void main(String[] args)
	{
		Stream<String> stream = Stream.of("Peter", "John", "Ram");
		
		List<String> nameList = stream.collect(Collectors.toList());

		System.out.println(nameList);
	}

}