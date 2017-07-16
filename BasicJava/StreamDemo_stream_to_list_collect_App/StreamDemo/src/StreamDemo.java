import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * Convert Stream to List using stream.collect(Collectors.toList())
 *
 */
public class StreamDemo
{
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 20; i++)
		{
			list.add(i);
		}
		Stream<Integer> stream = list.stream();

		List<Integer> evenNumbersList = stream.filter(i -> i % 2 == 0)
											  .collect(Collectors.toList());

		System.out.print(evenNumbersList);
	}
}