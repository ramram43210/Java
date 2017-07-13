import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo2
{
	public static void main(String[] args)
	{
		// Create an array
		Integer[] numberArray ={ 1, 5, 8, 10 };

		// Convert it into a Stream
		Stream<Integer> stream = Arrays.stream(numberArray);
		System.out.println(stream);
		System.out.println("Count =  "+stream.count());

	}
}