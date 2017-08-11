import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamMapDemo
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		System.out.print("\nStream = ");

		/*
		 * Stream.map(): It returns a stream after applying given
		 * function to each element of the stream.
		 */
		Stream<Integer> stream = list.stream().map(i -> i * i);
		stream.forEach(s -> System.out.print(s + " "));

		System.out.print("\nDoubleStream = ");

		/*
		 * mapToDouble(): It returns DoubleStream after applying the
		 * given function.
		 */
		DoubleStream doubleStream = list.stream().mapToDouble(i -> i * i);
		doubleStream.forEach(s -> System.out.print(s + " "));

		System.out.print("\nLongStream = ");

		/*
		 * mapToLong(): It returns LongStream after applying the given
		 * function.
		 */
		LongStream longStream = list.stream().mapToLong(i -> i * i);
		longStream.forEach(s -> System.out.print(s + " "));

		System.out.print("\nIntStream = ");

		/*
		 * mapToInt(): It returns IntStream after applying the given
		 * function.
		 */
		IntStream intStream = list.stream().mapToInt(i -> i * i);
		intStream.forEach(s -> System.out.print(s + " "));
	}
}