import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class StreamDemo1
{
	public static void main(String[] args)
	{
		// Create an ArrayList
		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(1);
		numberList.add(5);
		numberList.add(8);

		// Convert it into a Stream
		Stream<Integer> stream = numberList.stream();
		System.out.println(stream);
		System.out.println("Count =  "+stream.count());

	}
}