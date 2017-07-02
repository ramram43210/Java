import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1
{
	public static void main(String[] args)
	{
		List<String> namesList = Arrays.asList("Ram", "Peter","Pradeep", "Steve");

		/*
		 * Convert list to stream.
		 * 
		 * Returns a sequential Stream with this collection as its
		 * source.
		 */
		Stream<String> stream = namesList.stream();
		/*
		 * filters the name, starts with "P".
		 * 
		 * Returns a stream consisting of the elements of this stream
		 * that match the given predicate.
		 */
		stream = stream.filter(name -> name.startsWith("P"));

		/*
		 * Collect the output and convert streams to a List.
		 * 
		 * Performs a mutable reduction operation on the elements of
		 * this stream using a Collector.
		 */
		List<String> filteredNameList = stream.collect(Collectors.toList());

		filteredNameList.forEach(System.out::println);
	}

}