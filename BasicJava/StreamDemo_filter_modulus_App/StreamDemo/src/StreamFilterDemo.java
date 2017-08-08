import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamFilterDemo
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(3, 4, 6);

		/*
		 * Stream.filter()
		 * 
		 * It returns the stream with the elements that matches the
		 * given Predicate.
		 */
		Predicate<Integer> p = num -> num % 2 == 0;
		list.stream().filter(p)
				.forEach(e -> System.out.print(e + " "));
	}
}