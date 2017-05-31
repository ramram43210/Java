import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

class Numbers
{
	public static boolean isMoreThanFifty(int n1, int n2)
	{
		return (n1 + n2) > 50;
	}

	public static List<Integer> findNumbers(List<Integer> list,
										BiPredicate<Integer, Integer> p)
	{
		List<Integer> newList = new ArrayList<>();
		for (Integer i : list)
		{
			if (p.test(i, i + 10))
			{
				newList.add(i);
			}
		}
		return newList;
	}
}