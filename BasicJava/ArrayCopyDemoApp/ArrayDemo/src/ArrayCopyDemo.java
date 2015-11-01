/*
 * Method : 
 * 
 * 	arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
 *
 * Parameters:
 *  
 *   src - the source array.
 *   srcPos - starting position in the source array.
 *   dest - the destination array.
 *   destPos - starting position in the destination data.
 *   length - the number of array elements to be copied.
 */

class ArrayCopyDemo
{
	public static void main(String[] args)
	{
		int[] srcArray = { 500, 600, 700, 800, 900 };

		System.out.println("srcArray content \n");
		displayArrayConetent(srcArray);

		int[] destArray = new int[3];

		System.out
				.println("\ndestArray content , Before Copy from srcArray to destArray\n");
		displayArrayConetent(destArray);

		/*
		 * Copies an array from the specified source array, beginning at the
		 * specified position, to the specified position of the destination
		 * array.
		 */
		System.arraycopy(srcArray, 2, destArray, 0, 3);

		System.out
				.println("\ndestArray content , After Copy from srcArray to destArray\n");
		displayArrayConetent(destArray);
	}

	private static void displayArrayConetent(int[] array)
	{
		int i = 0;
		for (int element : array)
		{
			System.out.println("Element at Index " + i + " : " + element);
			++i;
		}
		System.out.println("----------------------------------------");
	}
}