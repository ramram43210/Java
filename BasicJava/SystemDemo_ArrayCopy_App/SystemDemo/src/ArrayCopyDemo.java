/*
 * public static void arraycopy(Object src, int srcPos,
 * 					Object dest, int destPos, int length)
 * 
 * Parameters: 
 * -----------
 * 
 * src - the source array. 
 * srcPos - starting position in the source array. 
 * dest - the destination array.
 * destPos - starting position in the destination data.
 * length - the number of array elements to be copied.
 */

public class ArrayCopyDemo
{

	public static void main(String[] args)
	{
		int srcArray[] =
		{ 30, 40, 50 };
		int destArray[] =
		{ 1, 2, 3, 4 };

		System.out.print("Before copy, destArray = ");
		for (int i : destArray)
		{
			System.out.print(i + ",");
		}

		/*
		 * Copies an array from the specified source array,
		 * beginning at the specified position, to the
		 * specified position of the destination array.
		 */
		System.arraycopy(srcArray, 0, destArray, 0, 3);
		System.out.print("\nAfter copy, destArray = ");
		for (int i : destArray)
		{
			System.out.print(i + ",");
		}

	}
}