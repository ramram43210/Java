import java.util.Arrays;
import java.util.List;

public class StreamFindDemo
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("G", "B", "F", "E");

		/*
		 * findAny(): It can return any element of the stream.
		 */
		String any = list.stream().findAny().get();
		System.out.println("FindAny: " + any);

		/*
		 * findFirst(): It returns first element of the stream and if
		 * stream has defined no encounter order, then it may return
		 * any element.
		 */
		String first = list.stream().findFirst().get();
		System.out.println("FindFirst: " + first);
	}
}