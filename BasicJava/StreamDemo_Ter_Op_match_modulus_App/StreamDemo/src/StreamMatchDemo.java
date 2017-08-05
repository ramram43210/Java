import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamMatchDemo
{
	public static void main(String[] args)
	{
		
		List<Integer> list = Arrays.asList(3, 5, 6);
		
		Predicate<Integer> p = num -> num % 2 == 0;

		/*
		 * allMatch(): It returns true if all elements of stream
		 * matches the given Predicate.
		 */
		System.out.println("allMatch = " + list.stream().allMatch(p));

		/*
		 * anyMatch(): It returns true if any element of stream
		 * matches the given Predicate.
		 */
		System.out.println("anyMatch = " + list.stream().anyMatch(p));

		/*
		 * noneMatch(): It returns true if none of the elements of
		 * stream matches the given Predicate.
		 */
		System.out.println("noneMatch = " + list.stream().noneMatch(p));
	}
}