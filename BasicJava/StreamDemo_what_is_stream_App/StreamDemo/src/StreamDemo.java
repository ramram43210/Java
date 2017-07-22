import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo
{
	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		// get List from Stream Operation
		List<String> result = numbers.stream()
									 .filter(i -> (i % 2) == 0)
									 .map(i -> "[" + i + "]")
									 .collect(Collectors.toList());

		System.out.println(result);
	}
}