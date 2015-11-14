class BreakDemo
{
	public static void main(String[] args)
	{

		/*
		 * An unlabeled break statement terminates the innermost switch, for,
		 * while, or do-while statement.
		 */

		for (int i = 0; i < 3; i++)
		{
			System.out.println("i : " + i + "\n");
			for (int j = 0; j < 4; j++)
			{
				System.out.println("j :" + j);
				if (j == 2)
				{
					break;
				}
				System.out.println("j : after break :" + j);
			}
			System.out.println("for loop j completed");
			System.out.println("-------------------------");

		}
		System.out.println("for loop i Completed");

	}
}