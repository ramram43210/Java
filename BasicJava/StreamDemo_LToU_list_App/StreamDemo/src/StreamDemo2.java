import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2
{
	public static void main(String[] args)
	{

		// streams apply to any data type.
		List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);
		
		List<Integer> resultList = numberList.stream().map(n -> n * 2)
								               .collect(Collectors.toList());
		
		System.out.println(resultList); // [2, 4, 6, 8, 10]
	}

}