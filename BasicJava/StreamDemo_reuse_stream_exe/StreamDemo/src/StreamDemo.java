import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo
{
	public static void main(String[] args)
	{

		Stream<String> stream = Stream.of("a", "b", "c");				

		Optional<String> anyElement = stream.findAny();

		System.out.println("anyElement = " + anyElement);

		/*
		 * Attempt to reuse the same reference after calling the
		 * terminal operation will trigger the IllegalStateException.
		 * 
		 * As the IllegalStateException is a RuntimeException, a
		 * compiler will not signalize about a problem. So, it is very
		 * important to remember that Java 8 streams can’t be reused.
		 * 
		 * This kind of behavior is logical because streams were
		 * designed to provide an ability to apply a finite sequence
		 * of operations to the source of elements in a functional
		 * style, but not to store elements.
		 */
		Optional<String> firstElement = stream.findFirst();
		System.out.println("firstElement = " + firstElement);
	}

}