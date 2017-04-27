import java.util.ArrayList;
import java.util.List;

public class GenericDemo
{

	public static void main(String[] args)
	{
		Pair<String, Integer> pair1 = new OrderedPair<String, Integer>("age", 12);
		System.out.println(pair1.getKey() + "=" + pair1.getValue());

		Pair<String, String> pair2 = new OrderedPair<String, String>("user", "root");
		System.out.println(pair2.getKey() + "=" + pair2.getValue());

		List<String> nameList = new ArrayList<>();
		nameList.add("Peter");
		nameList.add("Ram");

		/*
		 * We can also substitute a type parameter (i.e., K or V) with
		 * a parameterized type (i.e., List<String>).
		 */
		Pair<String, List<String>> pair3 = new OrderedPair<String, List<String>>(
				                                                   "names", nameList);
		System.out.println(pair3.getKey() + "=" + pair3.getValue());

	}

}
