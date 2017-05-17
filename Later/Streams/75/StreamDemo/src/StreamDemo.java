import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamDemo
{
	public static void main(String[] args)
	{
		/*
		 * reduced = 6 (1 + 2 + 3)
		 */
		OptionalInt reduced =
				  IntStream.range(1, 4).reduce((a, b) -> a + b);
		
		System.out.println(reduced.getAsInt());
		
		/*
		 * reducedTwoParams = 16 (10 + 1 + 2 + 3)
		 */
		int reducedTwoParams =
				  IntStream.range(1, 4).reduce(10, (a, b) -> a + b);
		
		System.out.println(reducedTwoParams);
	}

}