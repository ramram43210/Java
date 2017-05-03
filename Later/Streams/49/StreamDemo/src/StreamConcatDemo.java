import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamConcatDemo
{
	public static void main(String[] args)
	{
		Predicate<Integer> p = num -> num % 2 == 0;
		List<Integer> list = Arrays.asList(3, 4, 6);
		/*
		 * It returns the number of elements in stream.
		 */
		System.out.println("With out filter, Count = " + list.stream().count());

		System.out
				.println("After filter, Count =  " + list.stream().filter(p).count());
	}
}