import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * Convert Stream to array using stream.toArray(EntryType[]::new)
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
		Integer[] evenNumbersArr = stream.filter(i -> i % 2 == 0)
										 .toArray(Integer[]::new);

		for (Integer evenNumber : evenNumbersArr)
		{
			System.out.println(evenNumber);
		}
	}
}