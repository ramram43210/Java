import java.util.Arrays;

public class StreamReduceDemo2
{
	public static void main(String[] args)
	{
		int[] numberArray = { 2, 3, 5};

		/*
		 * Version #2: T reduce(T identity, BinaryOperator<T> accumulator) -
		 * This method is similar to the version #1, but it returns the reduced
		 * value of the specified type T. The identity value must be an identity
		 * value for the accumulator function, which means it does not affect
		 * the result of accumulation.
		 * 
		 * The following code calculates sum of numbers in a stream:
		 */
		int sum = Arrays.stream(numberArray).reduce(0, (x, y) -> (x + y));

		System.out.println("sum = " + sum);

	}

}