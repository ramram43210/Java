import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamCountDemo
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(3, 4, 6);
		/*
		 * It returns the number of elements in stream.
		 */
		System.out.println("With out filter, Count = " + list.stream().count());

		Predicate<Integer> p = num -> num % 2 == 0;
		
		System.out.println("After filter, Count =  " + list.stream().filter(p).count());
	}
}