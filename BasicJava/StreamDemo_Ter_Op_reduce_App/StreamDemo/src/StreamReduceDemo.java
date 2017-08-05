import java.util.Arrays;
import java.util.List;

public class StreamReduceDemo
{
	public static void main(String[] args)
	{
		List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		/*
		 * reduce processes all elements of the stream and produces a
		 * single result.
		 */
		numberList.stream().reduce((i1, i2) -> i1 > i2 ? i1 : i2)
				.ifPresent(i -> System.out.println("max: " + i));

		Integer total = numberList.stream().reduce(0,(i1, i2) -> i1 + i2);

		System.out.println("total: " + total);
	}
}