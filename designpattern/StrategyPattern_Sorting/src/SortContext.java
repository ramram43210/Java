import java.util.Scanner;

public class SortContext
{

		private SortingStrategy sortingStrategy;

		public void setSortingStrategy( SortingStrategy sortingStrategy )
		{
				this.sortingStrategy = sortingStrategy;
		}

		private void printArray( int[] inputArray )
		{
				for( int i = 0; i < inputArray.length; i++ )
				{
						System.out.print(inputArray[i] + ",");
				}
				System.out.println("\n");

		}

		private int[] readUserInput()
		{
				System.out.println("Enter array size : ");

				Scanner scanner = new Scanner(System.in);
				int n = scanner.nextInt();

				System.out.println("Enter input array  : ");
				int[] inputArray = new int[n];
				for( int i = 0; i < n; i++ )
				{
						inputArray[i] = scanner.nextInt();
				}
				return inputArray;
		}

		public void sort()
		{
				int[] inputArray = readUserInput();
				inputArray = sortingStrategy.sort(inputArray);
				printArray(inputArray);
		}
}