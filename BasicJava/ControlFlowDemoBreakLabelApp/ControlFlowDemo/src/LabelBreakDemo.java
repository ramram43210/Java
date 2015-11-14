class LabelBreakDemo
{
	public static void main(String[] args)
	{

		/*
		 * labeled break terminates an outer statement.
		 */

		stop:
		for (int i = 0; i < 3; i++)
		{
			System.out.println("i : " + i + "\n");
			for (int j = 0; j < 4; j++)
			{
				System.out.println("j : " + j);
				if (j == 2)
				{
					break stop;
				}
				System.out.println("j : after break :" + j);
			}
			System.out.println("for loop j completed-------------------------");

		}

		System.out.println("for loop i Completed");

	}
}