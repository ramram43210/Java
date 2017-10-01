import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Convert Streams to Other DataStructures
 * 
 * Get arrays using stream.toArray(EntryType[]::new)
 */
public class StreamDemo2
{
	public static void main(String[] args)
	{
		List<Integer> numberList = new ArrayList<>();
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(4);
		
		Stream<Integer> stream = numberList.stream();
		Integer[] evenArray = stream.filter(i -> i % 2 == 0).toArray(Integer[]::new);
		for (Integer integer : evenArray)
		{
			System.out.println(integer);
		}
	}

}