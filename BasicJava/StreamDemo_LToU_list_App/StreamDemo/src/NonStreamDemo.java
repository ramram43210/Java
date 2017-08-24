import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonStreamDemo
{
	public static void main(String[] args)
	{

		List<String> lowerAlphaList = Arrays.asList("a", "b", "c ");
		System.out.println("lowerAlphaList = "+lowerAlphaList); // [a, b, c, d]

		// Before Java8
		List<String> upperAlphaList = new ArrayList<>();
		for (String str : lowerAlphaList)
		{
			upperAlphaList.add(str.toUpperCase());
		}

		System.out.println("upperAlphaList = "+upperAlphaList); // [A, B, C, D]

	}

}