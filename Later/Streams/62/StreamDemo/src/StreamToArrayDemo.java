import java.util.Arrays;
import java.util.List;

public class StreamToArrayDemo
{
	public static void main(String[] args)
	{

		/*
		 * toArray(): It returns an array containing the elements of
		 * stream.
		 */
		List<String> list = Arrays.asList("A", "B", "C", "D");
		Object[] objArray = list.stream().toArray();
		System.out.println("Length of array: " + objArray.length);

		for (Object object : objArray)
		{
			System.out.println(object);
		}
	}
}