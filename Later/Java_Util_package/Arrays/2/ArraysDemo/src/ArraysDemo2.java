import java.util.Arrays;

public class ArraysDemo2
{

	public static void main(String[] args)
	{

		int[] intArr = { 10, 5, 8, 90, 50, 40 };

		int searchKey = 5;

		/*
		 * Parameters:
		 * 
		 * a - the array to be searched
		 * 
		 * fromIndex - the index of the first element (inclusive) to
		 * be searched
		 * 
		 * toIndex - the index of the last element (exclusive) to be
		 * searched
		 * 
		 * key - the value to be searched for
		 * 
		 * Returns:
		 * 
		 * index of the search key, if it is contained in the array
		 * within the specified range; otherwise, (-(insertion point)
		 * - 1).
		 */
		int indexOfSearchKey = Arrays.binarySearch(intArr, 0, 3, searchKey);

		System.out.println("indexOfSearchKey =  " + indexOfSearchKey);
	}

}
