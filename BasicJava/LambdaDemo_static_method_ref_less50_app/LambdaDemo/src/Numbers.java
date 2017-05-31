import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Numbers
{
	public static boolean isLessThanFifty(int number)
	{
		return number < 50;
	}

	public static List<Integer> findNumbers(List<Integer> list,
												Predicate<Integer> p)
	{
		List<Integer> newList = new ArrayList<>();
		for (Integer i : list)
		{
			/*
			 * test the number is less than 50
			 * then add to the newList.
			 */
			if (p.test(i))
			{
				newList.add(i);
			}
		}
		return newList;
	}
}