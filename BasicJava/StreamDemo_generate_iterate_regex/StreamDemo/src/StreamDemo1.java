import java.util.Arrays;
import java.util.stream.Stream;
/**
 * Generate Stream using Stream.generate()
 */
public class StreamDemo1
{
	public static void main(String[] args)
	{
		Stream<String> stream = Stream.generate(() -> "welcome").limit(5);
		String[] strArr = stream.toArray(String[]::new);
		System.out.println(Arrays.toString(strArr));
	}

}