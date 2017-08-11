import java.util.Arrays;

public class StreamReduceDemo
{
	public static void main(String[] args)
	{

		/*
		 * reduce(): It performs reduction on stream elements using a
		 * identity value and accumulation function.
		 */
		int[] intArray = { 3, 5, 10, 15 };
		int sum = Arrays.stream(intArray).reduce(0, (x, y) -> x + y);
		System.out.println("Sum:" + sum);
	}
}