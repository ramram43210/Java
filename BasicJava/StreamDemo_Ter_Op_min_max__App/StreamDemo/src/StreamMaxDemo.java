import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamMaxDemo
{
	public static void main(String[] args)
	{

		Optional<String> optional = Stream.of("A", "B", "C")
				.max(new Comparator<String>()
				{
					@Override
					public int compare(String o1, String o2)
					{
						return o1.compareTo(o2);
					}
				});
		System.out.println("optional = "+optional);
		System.out.println("Max = "+optional.get());
	}
}