import java.util.Arrays;
import java.util.List;

public class StreamDistinctDemo
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(3, 4, 4, 6, 6, 4);

		/*
		 * Stream.distinct() 
		 * 
		 * It returns stream with distinct elements.
		 */
		System.out.println("Distinct Count: "
				+ list.stream().distinct().count());
	}
}