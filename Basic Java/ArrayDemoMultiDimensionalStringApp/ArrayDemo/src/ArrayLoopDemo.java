public class ArrayLoopDemo
{

	public static void main(String[] args)
	{
		String[][] strArray = new String[3][2];

		strArray[0][0] = "Ram";
		strArray[0][1] = "Peter";

		strArray[1][0] = "Apple";
		strArray[1][1] = "Ball";

		strArray[2][0] = "Bike";
		strArray[2][1] = "Car";

		int rows = strArray.length;

		System.out.println("Number of rows : " + rows + "\n");

		for (int i = 0; i < rows; i++)
		{
			int columns = strArray[i].length;

			System.out.println("Number of columns in row " + i + " is : "
					+ columns);

			for (int j = 0; j < columns; j++)
			{
				System.out.println("Element at " + "strArray[" + i + "]" + "["
						+ j + "] : " + strArray[i][j]);

			}
			System.out.println();
		}

	}

}
