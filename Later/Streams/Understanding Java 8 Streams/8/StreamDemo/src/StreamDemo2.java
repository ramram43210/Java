import java.util.stream.IntStream;

/**
 * Terminal operation : reduce()
 */
public class StreamDemo2
{
	public static void main(String[] args)
	{
	
		/*
		 * reduce() operation combines the stream elements into one using a
		 * BinaryOperator.
		 * 
		 */
		int result = IntStream.of(1, 2, 3, 4).reduce(0, (a, b) -> a + b);
		System.out.println(result);
	}

}