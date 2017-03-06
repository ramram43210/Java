import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaDemo
{
	public static void main(String[] args)
	{

		List<Integer> list = Arrays.asList(12, 55, 75, 88, 24, 40);

		// Using an anonymous class
		List<Integer> listOfNumbers = Numbers.findNumbers(list, new Predicate<Integer>()
		{
			public boolean test(Integer i)
			{
				return Numbers.isLessThanFifty(i);
			}
		});
		
		System.out.println("listOfNumbers using a anonymous class = "+listOfNumbers);
		
		// Using a lambda expression
		listOfNumbers =Numbers.findNumbers(list, (i) -> Numbers.isLessThanFifty(i));
		System.out.println("listOfNumbers using a lambda expression = "+listOfNumbers);
		
		// Using a method reference
		listOfNumbers = Numbers.findNumbers(list, Numbers::isLessThanFifty);
		System.out.println("listOfNumbers using a method reference = "+listOfNumbers);
	}

}
