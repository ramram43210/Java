import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 
 * This example will print an empty result, because filter() has
 * no idea how to filter a stream of String[].
 *
 */
public class NonFlatMapDemo
{
	public static void main(String[] args)
	{

		String[][] strArray = new String[][] { { "a", "b" }, { "c", "d" },{ "e", "f" } };

		// Stream<String[]>
		Stream<String[]> strArrayStream = Arrays.stream(strArray);

		// filter a stream of string[], and return a string[]?
		Stream<String[]> filterdStream = strArrayStream
				.filter(x -> "c".equals(x.toString()));

		filterdStream.forEach(System.out::println); //Output is empty...
	}

}