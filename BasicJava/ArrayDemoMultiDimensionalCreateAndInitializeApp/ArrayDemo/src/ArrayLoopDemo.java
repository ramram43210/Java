public class ArrayLoopDemo
{

	public static void main(String[] args)
	{
		int[][] intArray = {{10,20,30},{100,200,300}};
		
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
