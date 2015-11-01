public class ArrayLoopDemo
{

	public static void main(String[] args)
	{
		int[][] intArray = new int[2][3];

		intArray[0][0] = 10;
		intArray[0][1] = 20;
		intArray[0][2] = 30;

		intArray[1][0] = 100;
		intArray[1][1] = 200;
		intArray[1][2] = 300;

		int rows = intArray.length;

		System.out.println("Number of rows : " + rows+"\n");
		
		for (int i = 0; i < rows; i++)
		{
			int columns = intArray[i].length;
			
			System.out.println("Number of columns in row "+ i +" is : " + columns);
			
			for (int j = 0; j < columns; j++)
			{
				System.out.println("Element at " + "intArray[" + i + "]" + "["
						+ j + "] : " + intArray[i][j]);

			}
			System.out.println();
		}

	}

}
