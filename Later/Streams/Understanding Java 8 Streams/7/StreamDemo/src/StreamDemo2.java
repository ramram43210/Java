import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Terminal operation : collect()
 */
public class StreamDemo2
{
	public static void main(String[] args)
	{
		Stream<String> stream = Stream.of("Apple", "Ball", "Cat");

		/*
		 * collect() operation helps to collect the stream result in a
		 * collection like list.
		 */
		List<String> list = stream.collect(Collectors.toList());
		System.out.println(list);
	}

}