import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Before JDK8
 * 
 * We want to iterate over a list of integers and find out sum
 * of all the integers greater than 10.
 * 
 */
public class NonStreamDemo
{
	public static void main(String[] args)
	{

		List<Integer> numberList = Arrays.asList(2, 5, 10, 20, 50);
		int sum = calculateSum(numberList);
		System.out.println("sum = " + sum);
	}

	private static int calculateSum(List<Integer> list)
	{
		Iterator<Integer> it = list.iterator();
		int sum = 0;
		while (it.hasNext())
		{
			int num = it.next();
			if (num > 10)
			{
				sum += num;
			}
		}
		return sum;
	}
}