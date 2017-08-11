import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamMaxMinDemo
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("Z", "B", "I", "E");

		/*
		 * max(): It finds maximum element for the given Comparator.
		 */
		String max = list.stream()
						 .max(Comparator.comparing(String::valueOf)).get();
		
		System.out.println("Max:" + max);

		/*
		 * min(): It finds minimum element for the given Comparator.
		 */
		String min = list.stream()
				         .min(Comparator.comparing(String::valueOf)).get();
		
		System.out.println("Min:" + min);
	}
}