import java.util.Arrays;
import java.util.List;

public class StreamMatchDemo
{
	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		boolean isAllNumbersLargerThanFive = numbers.stream()
				.allMatch(i -> i > 5);
		System.out.println(isAllNumbersLargerThanFive); // false

		
		boolean hasNumberLargerThanFive = numbers.stream()
				.anyMatch(i -> i > 5);
		System.out.println(hasNumberLargerThanFive); // true

		boolean isNoneNumberLargerThanTen = numbers.stream()
				.noneMatch(i -> i > 10);
		System.out.println(isNoneNumberLargerThanTen); // true
	}
}