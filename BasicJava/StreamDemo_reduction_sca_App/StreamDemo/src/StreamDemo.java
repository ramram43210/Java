import java.util.Arrays;
import java.util.OptionalDouble;

/**
 * 
 * A reduction operation is one which allows you to compute a result
 * using all the elements present in a stream.
 * 
 * Reduction operations are also called terminal operations because
 * they are always present at the end of a chain of Stream methods
 * 
 * Java 8 includes several reduction methods, such as sum, average and
 * count, which allow to perform arithmetic operations on Stream
 * objects and get numbers as results.
 */
public class StreamDemo
{
	public static void main(String[] args)
	{
		int[] numberArray = { 2, 6, 8 };
		int sum = Arrays.stream(numberArray).sum();
		System.out.println("sum = " + sum);

		long count = Arrays.stream(numberArray).count();
		System.out.println("count = " + count);

		OptionalDouble optionalDouble = Arrays.stream(numberArray).average();
		System.out.println("average = " + optionalDouble.getAsDouble());
	}
}