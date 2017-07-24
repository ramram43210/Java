import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 
 * To enable parallelism, all you have to do is to create a parallel
 * stream, instead of sequential stream. And to surprise you, this is
 * really very easy.
 * 
 * Anytime you want to particular job using multiple threads in
 * parallel cores, all you have to call method parallelStream() method
 * instead of stream() method.
 *
 */
public class StreamDemo
{
	public static void main(String[] args)
	{
		List<Integer> numberList = new ArrayList<Integer>();
		
		for (int i = 1; i < 20; i++)
		{
			numberList.add(i);
		}
		
		// Here creating a parallel stream
		Stream<Integer> parallelStream = numberList.parallelStream();
		Integer[] evenNumbersArray = parallelStream.filter(i -> i % 2 == 0)
												   .toArray(Integer[]::new);
		
		for (Integer evenNumber : evenNumbersArray)
		{
			System.out.println(evenNumber);
		}
	}
}