public class MultidimensionalArrayDemo2
{
	public static void main(String[] args)
	{
		/*
		 * declare, instantiate, initialize
		 */
		int[][] intArray =
		{
		{ 1, 2, 3 },
		{ 4, 5, 6 } };// 2 rows and 3 columns

		int rows = intArray.length;

		for (int i = 0; i < rows; i++)
		{
			int columns = intArray[i].length;

			System.out.println("Number of columns in row " + i + " is : "
					+ columns);

			for (int j = 0; j < columns; j++)
			{
				System.out.println("Element at " + "intArray[" + i + "]" + "["
						+ j + "] : " + intArray[i][j]);

			}
			System.out.println();
		}

	}
}
