import java.util.ArrayList;
import java.util.List;

public class UnBoxingDemo
{

	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<>();
		list.add(new Integer(1));
		list.add(new Integer(2));
		for (Integer integerObj : list)
		{
			int i = integerObj; // Unboxing
			System.out.println(i);
		}

	}

}
