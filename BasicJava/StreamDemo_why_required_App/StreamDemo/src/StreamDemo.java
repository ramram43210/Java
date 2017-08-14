import java.util.Arrays;
import java.util.List;

/**
 * With JDK8
 * 
 * We want to iterate over a list of integers and find out sum
 * of all the integers greater than 10.
 * 
 */
public class StreamDemo
{
	public static void main(String[] args)
	{

		List<Integer> numberList = Arrays.asList(2, 5, 10, 20, 50);
		int sum = calculateSum(numberList);
		System.out.println("sum = " + sum);
	}

	private static int calculateSum(List<Integer> list)
	{
		return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
	}
}