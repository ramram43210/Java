import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo
{
	public static void main(String[] args)
	{

		List<String> alpha = Arrays.asList("a", "b", "c ");
		// Java 8
		List<String> alphaUpper = alpha.stream().map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(alphaUpper); // [A, B, C, D]

		
		// streams apply to any data type.
		List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);
		
		List<Integer> resultList = numberList.stream().map(n -> n * 2)
								               .collect(Collectors.toList());
		
		System.out.println(resultList); // [2, 4, 6, 8, 10]
	}

}