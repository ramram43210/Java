public class ContinueDemo
{
	public static void main(String[] args)
	{

		/*
		 * The continue statement skips the current iteration of a for, while ,
		 * or do-while loop. The unlabeled form skips to the end of the
		 * innermost loop's body and evaluates the boolean expression that
		 * controls the loop.
		 */

		for (int i = 0; i < 2; i++)
		{
			System.out.println("i : " + i + "\n");
			for (int j = 0; j < 3; j++)
			{
				if (j == 1)
				{
					continue;
				}
				System.out.println("j : " + j);
			}

			System.out.println("------------------------------");
		}

	}
}