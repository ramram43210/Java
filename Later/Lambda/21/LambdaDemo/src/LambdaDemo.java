import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class LambdaDemo
{
	public static void main(String[] args)
	{

		List<Integer> list = Arrays.asList(12, 5, 45, 18, 33, 24, 40);

		// Using an anonymous class
		List<Integer> listOfNumbers = Numbers.findNumbers(list, new BiPredicate<Integer, Integer>()
		{
			public boolean test(Integer i1, Integer i2)
			{
				return Numbers.isMoreThanFifty(i1, i2);
			}
		});
		
		System.out.println("listOfNumbers using a anonymous class = "+listOfNumbers);
		
		// Using a lambda expression
		listOfNumbers =Numbers.findNumbers(list, (i1, i2) -> Numbers.isMoreThanFifty(i1, i2));
		System.out.println("listOfNumbers using a lambda expression = "+listOfNumbers);
		
		// Using a method reference
		listOfNumbers = Numbers.findNumbers(list, Numbers::isMoreThanFifty);
		System.out.println("listOfNumbers using a method reference = "+listOfNumbers);
	}

}
