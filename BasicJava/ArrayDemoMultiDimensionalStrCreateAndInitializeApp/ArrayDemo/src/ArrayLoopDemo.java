public class ArrayLoopDemo
{

	public static void main(String[] args)
	{
		String[][] strArray =
			{
			{ "Ram", "Peter" },
			{ "Apple", "Ball" },
			{ "Bike", "Car" } };
		
		int rows = strArray.length;

		System.out.println("Number of rows : " + rows+"\n");
		
		for (int i = 0; i < rows; i++)
		{
			int columns = strArray[i].length;
			
			System.out.println("Number of columns in row "+ i +" is : " + columns);
			
			for (int j = 0; j < columns; j++)
			{
				System.out.println("Element at " + "strArray[" + i + "]" + "["
						+ j + "] : " + strArray[i][j]);

			}
			System.out.println();
		}

	}

}
