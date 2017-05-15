import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapDemo
{
	public static void main(String[] args)
	{

		int[][] intArray = {{1, 2, 3}, {4,5,6}};

        //1. Stream<int[]>
        Stream<int[]> arrayStream = Stream.of(intArray);

        //2. Stream<int[]> -> flatMap -> IntStream
        IntStream intStream = arrayStream.flatMapToInt(x -> Arrays.stream(x));

        intStream.forEach(x -> System.out.println(x));
	}

}