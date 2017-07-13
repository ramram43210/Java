import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Once you have a Stream object, you can use a variety of methods to
 * transform it into another Stream object. The first such method
 * we’re going to look at is the map method. It takes a lambda
 * expression as its only argument, and uses it to change every
 * individual element in the stream. Its return value is a new Stream
 * object containing the changed elements.
 *
 * How to use map to convert all elements in an array of strings to
 * uppercase.
 */
public class StreamDemo
{
	public static void main(String[] args)
	{
		String[] nameArray = new String[] { "Peter", "Steve", "paul", "Ram" };

		Stream<String> stream = Arrays.stream(nameArray);

		/*
		 * passing a lambda expression, one which can convert a string
		 * to uppercase.
		 *
		 * The Stream object returned contains the changed strings.
		 */
		Stream<String> upperCaseStream = stream.map(name -> name.toUpperCase());

		String[] upperCaseNameArray = upperCaseStream.toArray(String[]::new);

		for (String name : upperCaseNameArray)
		{
			System.out.println(name);
		}

	}
}