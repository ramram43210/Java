public class BubbleSort implements SortingStrategy
{

		public int[] sort( int[] inputArray )
		{
				int n = inputArray.length;
				for( int i = 0; i < n; i++ )
				{
						for( int j = 1; j < (n - i); j++ )
						{
								if( inputArray[j - 1] > inputArray[j] )
								{
										swap(j - 1, j, inputArray);
								}
						}
				}
				System.out.println("Array is sorted using Bubble Sort Algorithm");
				return inputArray;
		}

		private void swap( int k, int l, int[] inputArray )
		{
				int temp = inputArray[k];
				inputArray[k] = inputArray[l];
				inputArray[l] = temp;
		}
}