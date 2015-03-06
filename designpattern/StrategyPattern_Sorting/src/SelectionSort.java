public class SelectionSort implements SortingStrategy
{

		public int[] sort( int[] inputArray )
		{

				 // find the smallest element starting from position i
			    for (int i = 0; i < inputArray.length - 1; i++)
			    {
			        int min = i;  // record the position of the smallest
			        for (int j = i + 1; j < inputArray.length; j++)
			        {
			            // update min when finding a smaller element
			            if (inputArray[j] < inputArray[min])
			                min = j;
			        }
			 
			        // put the smallest element at position i
			        swap(inputArray, i, min);
			    }
				System.out.println("Array is sorted using Selection Sort Algorithm");
				return inputArray;
		}

		private void swap( int[] inputArray,int k, int l )
		{
				int temp = inputArray[k];
				inputArray[k] = inputArray[l];
				inputArray[l] = temp;
		}
}