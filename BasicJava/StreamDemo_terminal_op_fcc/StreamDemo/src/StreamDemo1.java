import java.util.Arrays;
import java.util.List;

/**
 * Terminal operation : foreach()
 */
public class StreamDemo1
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("Ball", "Cat", "Dog", "Apple");

		/*
		 * foreach operations helps iterate the elements of the Stream.
		 */
		list.stream().sorted().filter((s) -> !s.startsWith("B"))
				.map(String::toUpperCase).forEach(System.out::println);
	}

}