import java.util.Arrays;
import java.util.List;

public class StreamFindDemo
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("G", "B", "F", "E");

		/*
		 * findAny():
		 * 
		 * Returns:an Optional describing some element of this stream,
		 * or an empty Optional if the stream is empty
		 */
		String any = list.stream().findAny().get();
		System.out.println("FindAny: " + any);

		/*
		 * findFirst():
		 * 
		 * Returns:an Optional describing the first element of this
		 * stream, or an empty Optional if the stream is empty
		 */
		String first = list.stream().findFirst().get();
		System.out.println("FindFirst: " + first);
	}
}