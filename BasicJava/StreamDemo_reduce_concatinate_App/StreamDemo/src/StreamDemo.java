import java.util.Arrays;

/**
 * If you want to perform more complex reduction operations, however,
 * you must use the reduce method.
 * 
 * The reduce method expects two arguments: an identity element, and a
 * lambda expression. You can think of the identity element as an
 * element which does not alter the result of the reduction operation. 
 * 
 */
public class StreamDemo
{
	public static void main(String[] args)
	{
		String[] strArray ={ "Welcome ", "to ", "India ", "Peter" };

		/*
		 * Reduce method to concatenate all the elements.
		 */
		String result = Arrays.stream(strArray).reduce("",(a, b) -> a + b);

		System.out.println(result);
	}
}