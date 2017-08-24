import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1
{
	public static void main(String[] args)
	{

		List<String> lowerAlphaList = Arrays.asList("a", "b", "c ");
		System.out.println("lowerAlphaList = "+lowerAlphaList); // [a, b, c, d]
		// Java 8
		List<String> upperAlphaList = lowerAlphaList.stream().map(String::toUpperCase)
															 .collect(Collectors.toList());
		System.out.println("upperAlphaList = "+upperAlphaList); // [A, B, C, D]		
		
	}

}