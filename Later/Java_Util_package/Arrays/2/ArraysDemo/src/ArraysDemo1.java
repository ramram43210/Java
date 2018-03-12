import java.util.Arrays;

public class ArraysDemo1
{

	public static void main(String[] args)
	{

		int[] intArr = { 10, 5, 8, 90, 50, 40 };

		int searchKey = 50;

		/*
		 * Parameters:
		 * 
		 * a - the array to be searched
		 * 
		 * key - the value to be searched for
		 * 
		 * Returns:
		 * 
		 * index of the search key, if it is contained in the array;
		 * otherwise, (-(insertion point) - 1).
		 */
		int indexOfSearchKey = Arrays.binarySearch(intArr, searchKey);

		System.out.println("indexOfSearchKey =  " + indexOfSearchKey);
	}

}
