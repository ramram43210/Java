import java.util.Arrays;
import java.util.List;

public class StreamMatchDemo
{
	public static void main(String[] args)
	{
		List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		/*
		 * Returns:true if either all elements of the stream match the
		 * provided predicate or the stream is empty, otherwise false
		 */
		boolean isAllNumbersLargerThanFive = numberList.stream()
														.allMatch(i -> i > 5);
		System.out.println(isAllNumbersLargerThanFive); // false

		/*
		 * Returns:true if any elements of the stream match the
		 * provided predicate, otherwise false
		 */
		boolean hasNumberLargerThanFive = numberList.stream()
													.anyMatch(i -> i > 5);
		System.out.println(hasNumberLargerThanFive); // true

		/*
		 * Returns:true if either no elements of the stream match the
		 * provided predicate or the stream is empty, otherwise false
		 */
		boolean isNoneNumberLargerThanTen = numberList.stream()
													  .noneMatch(i -> i > 10);
		System.out.println(isNoneNumberLargerThanTen); // true
	}
}