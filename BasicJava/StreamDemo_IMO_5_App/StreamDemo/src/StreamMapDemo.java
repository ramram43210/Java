import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMapDemo
{
	public static void main(String[] args)
	{
		List<String> nameList = Arrays.asList("ram","peter");

		/*
		 * The example gets a new stream which all names are
		 * transformed from LowerCase to UpperCase.
		 */
		Stream<String> stream = nameList.stream()
										.map(name -> name.toUpperCase());

		stream.forEach(name -> System.out.println(name));

	}
}