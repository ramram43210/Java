import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapDemo
{
	public static void main(String[] args)
	{

		String[][] strArray = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "f" } };

		// Stream<String[]>
		Stream<String[]> strArrayStream = Arrays.stream(strArray);
		
		//Convert  Stream<String[]> to Stream<String>
		Stream<String> strStream = strArrayStream.flatMap((x -> Arrays.stream(x)));

		// filter a stream of string
		Stream<String> filterdStream = strStream
				.filter(x -> "c".equals(x.toString()));

		filterdStream.forEach(System.out::println); //Output is c
	}

}