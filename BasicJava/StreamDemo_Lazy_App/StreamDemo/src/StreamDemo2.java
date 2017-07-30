import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2
{
	public static void main(String[] args)
	{
		List<Integer> newNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		Stream<Integer> lazyStream = newNumbers.stream().filter(i -> {
			System.out.println("filter: [" + i + "]");
			return (i % 2) == 0;
		}).map(i -> {
			System.out.println("map: [" + i + "]");
			return i;
		});

		for (int i = 1; i <= 3; i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("running... " + i + " sec");
		}

		System.out.println("Going to call collect method..");
		System.out.println("---------------------------------\n");
		/*
		 * System only activates the command inside filter and map
		 * method after we call collect method.
		 */
		lazyStream.collect(Collectors.toList());

	}
}