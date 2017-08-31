import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamDemo
{
	public static void main(String[] args)
	{
		/*
		 * sum = 6 (1 + 2 + 3)
		 */
		OptionalInt optionalInt = IntStream.range(1, 4).reduce((a, b) -> a + b);
		
		System.out.println(optionalInt.getAsInt());
		
		/*
		 * sum = 16 (10 + 1 + 2 + 3)
		 */
		int sum = IntStream.range(1, 4).reduce(10, (a, b) -> a + b);
		
		System.out.println(sum);
	}

}