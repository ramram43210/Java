public class MultidimensionalArrayDemo1
{

	public static void main(String[] args)
	{
		int[][] intArray = new int[2][3];// 2 rows and 3 columns

		intArray[0][0] = 1;
		intArray[0][1] = 2;
		intArray[0][2] = 3;
		intArray[1][0] = 4;
		intArray[1][1] = 5;
		intArray[1][2] = 6;
		
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
