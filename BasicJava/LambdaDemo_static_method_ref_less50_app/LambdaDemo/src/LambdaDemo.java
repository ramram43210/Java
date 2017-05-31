import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaDemo
{
	public static void main(String[] args)
	{

		List<Integer> list = Arrays.asList(12, 55, 75, 88, 24, 40);

		// Using an anonymous class
		List<Integer> listOfLessthanfiftyNumbers = Numbers.findNumbers(list, new Predicate<Integer>()
		{
			public boolean test(Integer i)
			{
				return Numbers.isLessThanFifty(i);
			}
		});
		
		System.out.println("listOfLessthanfiftyNumbers - anonymous class = "+listOfLessthanfiftyNumbers);
		
		// Using a lambda expression
		listOfLessthanfiftyNumbers = Numbers.findNumbers(list, (i) -> Numbers.isLessThanFifty(i));
		System.out.println("listOfLessthanfiftyNumbers - lambda expression = "+listOfLessthanfiftyNumbers);
		
		// Using a method reference
		listOfLessthanfiftyNumbers = Numbers.findNumbers(list, Numbers::isLessThanFifty);
		System.out.println("listOfLessthanfiftyNumbers - method reference = "+listOfLessthanfiftyNumbers);
	}

}
