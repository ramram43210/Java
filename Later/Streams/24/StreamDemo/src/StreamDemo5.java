import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo5
{
	public static void main(String[] args)
	{
		IntStream intStream = "12345_abcdefg".chars();
		intStream.forEach(p -> System.out.println(p));
        
		System.out.println("\n-------------------------\n");
         
        Stream<String> stream = Stream.of("A$B$C".split("\\$"));
        stream.forEach(p -> System.out.println(p));
	}
}