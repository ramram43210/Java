import java.util.ArrayList;
import java.util.List;

public class AutoBoxingDemo
{

	public static void main(String[] args)
	{
		List<Integer> li = new ArrayList<>();

		for (int i = 1; i < 20; i += 2)
		{
			li.add(i);
		}
		System.out.println(li);
		System.out.println(li.get(0).getClass());
	}

}
