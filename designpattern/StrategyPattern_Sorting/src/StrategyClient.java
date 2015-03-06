import java.util.Scanner;

public class StrategyClient
{
		public static void main( String[] args )
		{

				System.out.println("Please enter Sort Algorithm  : 'BubbleSort' or 'SelectionSort' or 'InsertionSort'");
				Scanner scanner = new Scanner(System.in);
				String sortAlgorithm = scanner.next();
				System.out.println("Sort Algorithm is : " + sortAlgorithm);

				SortContext context = new SortContext();
				

				if( "BubbleSort".equalsIgnoreCase(sortAlgorithm) )
				{
						context.setSortingStrategy(new BubbleSort());
				}
				else if( "SelectionSort".equalsIgnoreCase(sortAlgorithm) )
				{
						context.setSortingStrategy(new SelectionSort());
				}
				else if( "InsertionSort".equalsIgnoreCase(sortAlgorithm) )
				{
						context.setSortingStrategy(new InsertionSort());
				}

				context.sort();

		}
}