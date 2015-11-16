class BreakWithLabelDemo
{
	public static void main(String[] args)
	{

		/*
		 * An unlabeled break statement terminates the innermost switch, for,
		 * while, or do-while statement, but a labeled break terminates an outer
		 * statement.
		 */

		int[][] arrayOfInts =
		{
		{ 1, 2, 3 },
		{ 4, 5, 6 },
		{ 7, 8, 9 } };

		int searchfor = 2;

		int i;
		int j = 0;
		boolean foundIt = false;

		search: for (i = 0; i < arrayOfInts.length; i++)
		{
			System.out.println("i:" + i);
			for (j = 0; j < arrayOfInts[i].length; j++)
			{
				System.out.println("arrayOfInts[" + i + "]" + "[" + j + "] : "
						+ arrayOfInts[i][j]);
				if (arrayOfInts[i][j] == searchfor)
				{
					foundIt = true;
					break search;
				}
			}
			System.out.println("for loop j is completed.");
		}

		System.out.println("for loop i is completed.");

		if (foundIt)
		{
			System.out.println("Found " + searchfor + " at " + i + ", " + j);
		}
		else
		{
			System.out.println(searchfor + " not in the array");
		}

	}
}